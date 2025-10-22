package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int calculate(int a, int b) {
		if(a > b)
			return a-b;
		return a+b;
	}

}
