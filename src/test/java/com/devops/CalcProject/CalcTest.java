
package com.devops.CalcProject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;

public class CalcTest {
	
	@Test
	public void testValidAdddition(){
		int result = CalcMain.addition(4,6);
		assertEquals(result,10);			
	}
    
	@Test
	public void testValidSubtraction(){
		int result = CalcMain.subtraction(6,3);
		assertEquals(result,3);			
	}
	
	@Test
	public void testValidMultiplication(){
		int result = CalcMain.multiplication(4,6);
		assertEquals(result,24);			
	}
	
	@Test
	public void testValidDivison(){
		float result = CalcMain.division(10,2); 
		assertEquals(result,5.0,5.0f);
	}
	
	@Test
	public void testValidRemainder(){
		int result = CalcMain.remainder(10,3);
		assertEquals(result,1);			
	}
	
	@Test
	public void testInvalidAdddition(){
		int result = CalcMain.addition(6,2);
		assertNotEquals(result,9);			
	}
    
	@Test
	public void testInvalidSubtraction(){
		int result = CalcMain.subtraction(10,4);
		assertNotEquals(result,8);			
	}
	
	@Test
	public void testInvalidMultiplication(){
		int result = CalcMain.multiplication(11,5);
		assertNotEquals(result,22);			
	}
	
	@Test
	public void testInvalidDivison(){
		float result = CalcMain.division(20,5); 
		assertNotEquals(result,5.0f);
	}
	
	@Test
	public void testInvalidRemainder(){
		int result = CalcMain.remainder(12,6);
		assertNotEquals(result,1);			
	}
}