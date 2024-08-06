package com.example.UmbrellaAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UmbrellaAcademyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UmbrellaAcademyApplication.class, args);

		UmbrellaAcademy umbrellaAcademy = context.getBean("umbrellaAcademy", UmbrellaAcademy.class);

		System.out.println("I should carry an umbrella in London: " + umbrellaAcademy.shouldICarry("London"));
		System.out.println("I should carry an umbrella in Tampa: " + umbrellaAcademy.shouldICarry("Tampa"));
		System.out.println("I should carry an umbrella in Las Vegas: " + umbrellaAcademy.shouldICarry("Las Vegas"));
		System.out.println("I should carry an umbrella in Detroit: " + umbrellaAcademy.shouldICarry("Detroit"));
	}



}
