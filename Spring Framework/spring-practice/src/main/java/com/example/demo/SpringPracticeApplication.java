package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
		ObjectEqualsChecker objectEqualsChecker = context.getBean(ObjectEqualsChecker.class);
		objectEqualsChecker.displayHashCode();
		Calculator calculator = (Calculator) context.getBean("calculator");
		System.out.println(calculator.calculate(2, 2));
	}
}
