package com.regex;
import java.util.regex.Matcher;
/*
 * For first Name:-> First name starts with Cap and has minimum 3 characters
 * For Last Name:-> Last name starts with Cap and has minimum 3 characters
 * For E-Mail Id:-> Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
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
	
	//For Last Name
	public void validateLastName(String lastName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		if(lastName.matches(pattern)) {
			System.out.println("Valid Last Name.");
		}else {
			System.out.println("Invalid Last Name.");
		}
	}
	
	//For Email Id
	public void validateEmail(String email) {
		String pattern = "^[a-z]+[.a-z]*@[a-z]+[.a-z]+[.a-z]*$";
		
		if(email.matches(pattern)) {
			System.out.println("Valid E-Mail Id.");
		}else {
			System.out.println("Invalid E-Mail Id.");
		}
	}
}
