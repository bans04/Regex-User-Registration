package com.regex;
import java.util.regex.Matcher;
/*
 * For first Name:-> First name starts with Cap and has minimum 3 characters
 * 
 * @Dnyandeo Bansode
 * 11/07/2022
 * 
 * */

public class Regex {
	
	//For first Name
	public void validateFirstName(String firstName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		if(firstName.matches(pattern)) {
			System.out.println("Valid First Name.");
		}else {
			System.out.println("Invalid First Name.");
		}
	}
}
