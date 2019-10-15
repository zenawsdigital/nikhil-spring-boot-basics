package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsApplication.class, args);
		
		System.out.println("Hello World!!");
		System.out.println("My first Spring Boot program!!");
		
		System.out.println("Spring Application started ....");
	}

}
