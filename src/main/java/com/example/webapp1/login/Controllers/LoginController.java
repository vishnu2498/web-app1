package com.example.webapp1.login.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/jsp")
    public String getLoginJsp()
    {
        return "login";
    }

    @GetMapping("/text")
    @ResponseBody
    public String getLogin()
    {
        return "login";
    }
}
