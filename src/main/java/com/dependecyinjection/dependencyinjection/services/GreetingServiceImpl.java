package com.dependecyinjection.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String GREETING = "Hello GreetingServiceImpl";
    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
