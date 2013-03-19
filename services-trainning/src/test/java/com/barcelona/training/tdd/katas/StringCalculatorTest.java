package com.barcelona.training.tdd.katas;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.barcelona.training.tdd.katas.StringCalculator;

public class StringCalculatorTest {

	
	StringCalculator stringCalculator;
	
	@Before
	public void init() {
		stringCalculator = new StringCalculator();
	}
	
	@Test
	public void testAddEmptyString() {
		
		int result = stringCalculator.add("");
		Assert.assertEquals(0, result);
	}

	@Test
	public void testAddOne() {
		int result = stringCalculator.add("1");
		Assert.assertEquals(1, result);
	}

	@Test
	public void testAddTwoNumbers() {
		int result = stringCalculator.add("1,2");
		Assert.assertEquals(3, result);
	}

	@Test
	public void testAddTwoNumbers2() {
		int result = stringCalculator.add("2,2");
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void testAddthreeNumbers() {
		int result = stringCalculator.add("2,2,2");
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void newlineSeparator() {
		int result = stringCalculator.add("1\n2,3");
		Assert.assertEquals(6, result);
	}

	@Test
	public void definedSeparator() {
		int result = stringCalculator.add("//;\n1;2");
		Assert.assertEquals(3, result);
	}
	
	
}
