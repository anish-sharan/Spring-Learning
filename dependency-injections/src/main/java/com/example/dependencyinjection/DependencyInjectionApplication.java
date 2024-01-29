package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.ConstructorInjectedController;
import com.example.dependencyinjection.controller.MyController;
import com.example.dependencyinjection.controller.PropertyInjectedController;
import com.example.dependencyinjection.controller.SetterInjection;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("--------------------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("Property injection " + propertyInjectedController.getGreeting());

		SetterInjection setterInjection = (SetterInjection) ctx.getBean("setterInjection");
		System.out.println("Setter injection " + setterInjection.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("constructor injected controller " + constructorInjectedController.getGreeting());

	}

}
