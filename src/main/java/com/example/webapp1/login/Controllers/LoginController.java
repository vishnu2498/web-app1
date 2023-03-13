package com.example.webapp1.login.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
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
}
