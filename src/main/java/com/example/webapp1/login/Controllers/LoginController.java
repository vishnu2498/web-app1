package com.example.webapp1.login.Controllers;

import com.example.webapp1.login.Services.AuthenticationService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
@RequestMapping("/login")
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/jsp")
    public String getLoginJsp(@RequestParam String name, ModelMap model)
    {
        model.put("name", name);
        log.info("The request param is : {}", name);
        return "login";
    }

    @GetMapping("/text")
    @ResponseBody
    public String getLogin()
    {
        log.info("Info jsp login page");
        log.debug("Debug jsp login page");
        return "login";
    }

    //Handles both GET request
    @GetMapping("/form")
    public String getLoginForm()
    {
        return "login";
    }

    //Handles POST request
    @PostMapping("/form")
    public String getWelcomeForm(@RequestParam String name, @RequestParam String password, ModelMap model)
    {
        model.addAttribute("name", name);

        if(authenticationService.authenticate(name,password))
            return "welcome";

        model.put("error", "Invalid Credentials, Please try again");
        return "login";

        //Add Authentication


    }
}
