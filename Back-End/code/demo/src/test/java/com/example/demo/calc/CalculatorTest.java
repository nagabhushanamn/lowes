package com.example.demo.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator(); // Arrange ( SUT )
		int sum = calculator.evaluate("1+2+3"); // Act
		assertEquals(6, sum); // Assert
	}

}
