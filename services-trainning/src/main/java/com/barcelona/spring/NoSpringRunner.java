package com.barcelona.spring;

public class NoSpringRunner {
	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.loadCars();
		NoSpringDIExample example = new NoSpringDIExample();
		example.setCar(car);
		example.doSomethingCool("Finner");
	}

}
