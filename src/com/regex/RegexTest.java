package com.regex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
 * Test cases for First Name, Last Name, E-Mail Id and Password
 * 
 * @Dnyandeo Bansode
 * 
 * */

class RegexTest {
	//For first name
	@Test
	void testForFirstName() {
		Regex regex = new Regex();
		assertEquals(true, regex.validateFirstName("Dnyandeo"));
	}
	
	//for last name
	@Test
	void testForLastName() {
		Regex regex = new Regex();
		assertEquals(true, regex.validateLastName("Bansode"));
	}
	
	//for email id
	@Test
	void testForEmailId() {
		Regex regex = new Regex();
		assertEquals(true, regex.validateEmail("abc.xyz@bl.co.in"));
	}
	
	//for password
	@Test
	void testForPassword() {
		Regex regex = new Regex();
		assertEquals(true, regex.validatePassward("Password@123"));
	}
}
