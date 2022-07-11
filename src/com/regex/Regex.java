package com.regex;
import java.util.regex.Matcher;
/*
 * For first Name:-> First name starts with Cap and has minimum 3 characters.
 * For Last Name:-> Last name starts with Cap and has minimum 3 characters.
 * For E-Mail Id:-> Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions.
 * 
 * For Passward rule no1:-> passward must be minimum 8 char
 * 				ruel no2:-> should have at least 1 upper case
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
	
	//for Mobile No
	public void validateMobileNo(String mobileNo) {
		String pattern = "^(91)?\\s[0-9]{10}$";
		
		if(mobileNo.matches(pattern)) {
			System.out.println("Valid Mobile No.");
		}else {
			
			System.out.println("Invalid Mobile No.");
		}
	}
	
	//For passward rule no 1
	public void validatePassward(String passward) {
		String pattern = "^[A-Z][a-z0-9]{7,}$";
		
		if(passward.matches(pattern)) {
			System.out.println("Valid Passward."); 
		}else{
			System.out.println("Invalid Passward.");
		}
	}
}
