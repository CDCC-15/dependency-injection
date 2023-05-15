package com.dependecyinjection.dependencyinjection.controller;

import com.dependecyinjection.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
