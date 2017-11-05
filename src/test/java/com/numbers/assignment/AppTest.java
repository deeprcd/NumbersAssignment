package com.numbers.assignment;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

	@Test
	public void testNumberConvSingleDigit() {
		
		ConvertNumbersToWords objSingleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(objSingleDigit.convert(5).trim(), "five");

	}
	
	@Test
	public void testNumberConvDoubleDigit() {
		
		ConvertNumbersToWords objDoubleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(objDoubleDigit.convert(10).trim(), "ten");

	}
	
	@Test
	public void testNumberConvTripleDigit() {
		
		ConvertNumbersToWords objTripleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(objTripleDigit.convert(123).trim(), "one hundred twenty three");

	}

}
