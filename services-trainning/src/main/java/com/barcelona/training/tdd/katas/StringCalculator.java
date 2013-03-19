package com.barcelona.training.tdd.katas;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.equals("")) return 0;
		
		int value = 0;
		if (numbers.startsWith("//")){
			String separator = numbers.substring(2, 3);
			
			for (String number: numbers.split(  separator  )){
				value +=Integer.parseInt(number);
			}
		}
		else{
			for (String number: numbers.split("[,\n]")) {
				value +=Integer.parseInt(number);
			}			
		}
			
		return value;
	}
}
