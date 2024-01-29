package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello world - Setter";
    }
}
