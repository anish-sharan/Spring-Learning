package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world - Constructor";
    }
}
