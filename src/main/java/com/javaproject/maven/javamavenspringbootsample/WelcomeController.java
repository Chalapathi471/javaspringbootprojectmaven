package com.javaproject.maven.javamavenspringbootsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String index(){
        return "Jenkins Spring Boot Project CD!";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome to SpringBoot Project";
    }
}
