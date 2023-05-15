package com.dependecyinjection.dependencyinjection.controller;

import com.dependecyinjection.dependencyinjection.services.GreetingService;
import com.dependecyinjection.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedControllerTest {
    private ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        System.out.println("@Before");
        GreetingService greetingService = new GreetingServiceImpl();
        constructorBasedController = new ConstructorBasedController(greetingService);
    }

    @AfterEach
    void tearDown() {
        System.out.println("@After");
    }

    @Test
    void sayHello() {
        System.out.println("@Test sayHello");
        String greeting = constructorBasedController.sayHello();

        assertEquals(25, greeting.length());
    }
}