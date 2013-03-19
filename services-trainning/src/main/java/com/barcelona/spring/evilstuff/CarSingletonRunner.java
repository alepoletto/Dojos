package com.barcelona.spring.evilstuff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CarSingletonRunner {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable thread = defineUglyThread();

		//execute 5 times
		executor.execute(thread);
		executor.execute(thread);
		executor.execute(thread);
		executor.execute(thread);
		executor.execute(thread);
		
		


		
		
	}

	private static Runnable defineUglyThread() {
		Runnable thread = new Runnable() {
			
			public void run() {
				CarSingleton singleton = CarSingleton.getInstance();
				singleton.addValue(10);
				System.out.println(singleton.getCarValue());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		return thread;
	}

}
