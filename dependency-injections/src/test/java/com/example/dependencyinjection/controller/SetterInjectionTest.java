package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionTest {
    SetterInjection setterController;

    @BeforeEach
    void setUp() {
        setterController = new SetterInjection();
        setterController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterController.getGreeting());
    }
}