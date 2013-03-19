package com.barcelona.spring.evilstuff;

import java.util.HashMap;
import java.util.Map;

import com.barcelona.spring.Vehicle;

public class CarSingleton implements Vehicle{
	
	private Map<String, String> cars = new HashMap<String, String>();

	private static CarSingleton carSingleton;
	
	private Integer carValue = 100;

	private CarSingleton(){
		
	}
	
	
	public static CarSingleton getInstance(){
		if(carSingleton == null) carSingleton = new CarSingleton();
		return new CarSingleton();
	}
	
			
	public String findModelByOwnerName(String ownerName) {
		return cars.get(ownerName);
	}
	
	public void loadCars(){
		cars.put("Finner","Fusca");
	}


	public Integer getCarValue() {
		return carValue;
	}


	public void addValue(Integer carValue) {
		this.carValue += carValue;
	}
	
	public Integer getValueStateless(Integer carValue) {
		Integer value = this.carValue + carValue;
		return value;
	}
	
	
	

}
