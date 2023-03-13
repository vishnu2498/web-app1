package com.example.webapp1.login.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/jsp")
    public String getLoginJsp(@RequestParam String name, ModelMap model)
    {
        model.put("name", name);
        return "login";
    }

    @GetMapping("/text")
    @ResponseBody
    public String getLogin()
    {
        return "login";
    }
}
