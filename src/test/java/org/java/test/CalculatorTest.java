package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Random;

import org.java.Calculator;
import org.junit.jupiter.api.RepeatedTest;


public class CalculatorTest {
	
	Random random = new Random();
	
	@RepeatedTest(10)
	public void sumTest() {
		final float num1 = random.nextFloat(0,100);
		final float num2 = random.nextFloat(0,100);
		
		final float sum = num1 + num2;
		
		final float res = Calculator.add(num1,num2);
		
		assertEquals(sum, res);
		
	}
	@RepeatedTest(10)
	public void subtractTest() {
		final float num1 = random.nextFloat(0,100);
		final float num2 = random.nextFloat(0,100);
		
		final float sub = num1 - num2;
		
		final float res = Calculator.subtract(num1,num2);
		
		assertEquals(sub, res);
		
	}
	@RepeatedTest(10)
	public void multiplyTest() {
		final float num1 = random.nextFloat(0,100);
		final float num2 = random.nextFloat(0,100);
		
		final float multiply = num1 * num2;
		
		final float res = Calculator.multiply(num1,num2);
		
		assertEquals(multiply, res);
		
	}
	@RepeatedTest(10)
	public void divideTest()throws Exception {
		final float num1 = random.nextFloat(0,100);
		final float num2 = random.nextFloat(0,100);
		
		assumeTrue(num2 != 0);
		
		final float divide = num1 / num2;
		
		final float res = Calculator.divide(num1,num2);
		
		assertEquals(divide, res);
		
	}
	public void divideExcTest() throws Exception {
		
		final float num1 = random.nextFloat(0,100);
		final float num2 = random.nextFloat(0,100);
		
		assumeTrue(num2 == 0);
		
		assertThrows(Exception.class,
						()->Calculator.divide(num1,num2));
		
	}
}
