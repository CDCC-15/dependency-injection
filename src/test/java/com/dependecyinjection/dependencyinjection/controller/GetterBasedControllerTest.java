package com.dependecyinjection.dependencyinjection.controller;

import com.dependecyinjection.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetterBasedControllerTest {
    private GetterBasedController  getterBasedController;

    @BeforeEach
    void setUp() {
        getterBasedController = new GetterBasedController();
        getterBasedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        String greeting = getterBasedController.sayHello();

        assertEquals(25, greeting.length());
    }
}