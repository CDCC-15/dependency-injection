package com.dependecyinjection.dependencyinjection.controller;

import com.dependecyinjection.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedControllerTest {
    private PropertyBasedController propertyBasedController;

    @BeforeEach
    void setUp() {
        propertyBasedController = new PropertyBasedController();
        propertyBasedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        String greeting = propertyBasedController.sayHello();

        assertEquals(25, greeting.length());
    }
}