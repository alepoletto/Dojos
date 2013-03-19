package com.barcelona.training.tdd.template;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.barcelona.training.tdd.template.TemplateProcessor;

public class TemplateProcessorTest {
	
	private TemplateProcessor template;
	
	@Before
	public void init(){
		template = new TemplateProcessor();
	}
	
	@Test
	public void testSimpleMessage(){
		String mensagen = template.apply("Ola $nome Bon DIa", "Xavi");
		Assert.assertEquals("Ola Xavi Bon DIa", mensagen);
	}
	
	
	@Test
	public void testAnotherName(){
		String mensagen = template.apply("Ola $nome Bon DIa", "Toni");
		Assert.assertEquals("Ola Toni Bon DIa", mensagen);
	}
	
	@Test
	public void testAnotherMessage(){
		String mensagen = template.apply("Ola que tal! $nome Bouenos Dias", "Toni");
		Assert.assertEquals("Ola que tal! Toni Bouenos Dias", mensagen);
	}

}
