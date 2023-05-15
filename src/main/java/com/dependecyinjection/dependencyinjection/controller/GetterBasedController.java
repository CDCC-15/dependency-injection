package com.dependecyinjection.dependencyinjection.controller;

import com.dependecyinjection.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GetterBasedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
