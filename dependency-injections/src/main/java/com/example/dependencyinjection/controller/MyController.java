package com.example.dependencyinjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController  {
    public  String sayHello(){
        System.out.println("HEllo");
        return "Hi";
    }
}
