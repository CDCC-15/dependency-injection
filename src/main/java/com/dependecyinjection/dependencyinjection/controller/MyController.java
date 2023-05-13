package com.dependecyinjection.dependencyinjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        String greeting = "Hello Spring";
        System.out.println(greeting);
        return greeting;
    }
}
