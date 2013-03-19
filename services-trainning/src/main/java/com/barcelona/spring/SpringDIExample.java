package com.barcelona.spring;

public class SpringDIExample {
	
	private Vehicle car;
	
	
	public SpringDIExample(Car car){
		this.car = car;
	}
	
	
	public SpringDIExample(){}
	
	
	
	public void doSomethingCool(String name){
		String model = car.findModelByOwnerName(name);
		System.out.println(model);
	}
	
	
	public void setCar(Vehicle car) {
		this.car = car;
	}
	
	
	public Vehicle getCar() {
		return car;
	}
	
	
	

}
