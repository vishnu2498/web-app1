package com.example.webapp1.login.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class LoginController {

    @GetMapping("/login")
    public String getLogin()
    {
        return "login";
    }
}
