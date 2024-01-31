package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.*;
import com.example.dependencyinjection.services.I18GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("Property injection " + propertyInjectedController.getGreeting());

		SetterInjection setterInjection = (SetterInjection) ctx.getBean("setterInjection");
		System.out.println("Setter injection " + setterInjection.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("constructor injected controller " + constructorInjectedController.getGreeting());

		I18Controller i18Controller = (I18Controller) ctx.getBean("i18Controller");
		System.out.println("I18N " + i18Controller.sayHello());

	}

}
