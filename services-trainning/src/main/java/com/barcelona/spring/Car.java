package com.barcelona.spring;

import java.util.HashMap;
import java.util.Map;

public class Car implements Vehicle {
	
	
	private Map<String, String> cars = new HashMap<String, String>();

	
	public String findModelByOwnerName(String ownerName) {
		return cars.get(ownerName);
	}
	
	public void loadCars(){
		cars.put("Finner","Fusca");
	}

}
