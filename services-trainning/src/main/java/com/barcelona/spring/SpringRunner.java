package com.barcelona.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.barcelona.spring.evilstuff.CarSingleton;
import com.barcelona.spring.evilstuff.CarSingletonRunner;

public class SpringRunner {
	
	private static ApplicationContext applicationContext;
	
	
	public static void main(String[] args) {
		CarSingleton carro = CarSingleton.getInstance();
		 applicationContext =  new ClassPathXmlApplicationContext("classpath:spring-training-beans.xml");
		 SpringDIExample example = applicationContext.getBean("springDIExample", SpringDIExample.class);
		 example.doSomethingCool("Finner");
	}
	
	

}
