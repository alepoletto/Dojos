package com.barcelona.spring;

public class NoSpringDIExample {
	
	private Car car;
	
	
	public NoSpringDIExample(){
		
	}
	
	
	
	public void doSomethingCool(String name){
		
		String model = car.findModelByOwnerName(name);
		System.out.println(model);
	}
	
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	
	public Car getCar() {
		return car;
	}
	
	

	
	
	
	

}
