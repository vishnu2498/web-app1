package com.example.webapp1.login.Services;

import org.springframework.stereotype.Service;

@Service // This is to make it a bean and make spring autowire it
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("Vishnu");
        boolean isValidPassword = password.equalsIgnoreCase("Vishnunitk");

        return isValidUserName && isValidPassword;
    }
}
