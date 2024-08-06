package com.example.UmbrellaAcademy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class UmbrellaAcademyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UmbrellaAcademyApplication.class, args);

	}

		@Bean
		public CommandLineRunner commandLineRunner(ApplicationContext context) {
			return args -> {
				System.out.println("Listing all the beans in the Spring IOC container:");
				int count = 0;
				String[] beanNames = context.getBeanDefinitionNames();
				Arrays.sort(beanNames);
				for (String beanName : beanNames) {
					System.out.println(beanName);
					count++;
				}
				System.out.println("There are " + count + " beans");
			};
	}



}
