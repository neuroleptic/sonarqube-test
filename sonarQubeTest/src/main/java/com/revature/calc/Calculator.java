package com.revature.calc;

public class Calculator {
		
	public static int add(String numbers) {
		int sum = 0;
		
		if(numbers.equals("")) {
			return sum;
		}
		String[] numbersArray = numbers.split(",");
		
		if(numbersArray.length>2) {
			throw new RuntimeException("Too many numbers");
		}
		
		for( String number : numbersArray) {
			if(!number.equals("")) {
				sum += Integer.parseInt(number);
			}
		}
		
		return sum;
	}

}
