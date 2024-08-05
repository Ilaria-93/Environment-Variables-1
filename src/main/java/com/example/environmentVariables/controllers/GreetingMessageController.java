package com.example.environmentVariables.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingMessageController {

    @Value("${devName}")
    private String devName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, " + devName + "! Your auth code is " + authCode;
    }
}
