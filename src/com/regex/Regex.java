package com.regex;
import java.util.regex.Matcher;
/*
 * For first Name:-> First name starts with Cap and has minimum 3 characters.
 * For Last Name:-> Last name starts with Cap and has minimum 3 characters.
 * For E-Mail Id:-> Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions.
 * 
 * For Passward rule no1:-> passward must be minimum 8 char
 * 				ruel no2:-> should have at least 1 upper case
 * 				rule no3:-> should have at least 1 numaric num
 * 
 * @Dnyandeo Bansode
 * 11/07/2022
 * 
 * */

public class Regex {
	
	//For first Name
	public boolean validateFirstName(String firstName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		if(firstName.matches(pattern)) {
			System.out.println("Valid First Name.");
			return true;
		}else {
			System.out.println("Invalid First Name.");
			return false;
		}
	}
	
	//For Last Name
	public boolean validateLastName(String lastName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		if(lastName.matches(pattern)) {
			System.out.println("Valid Last Name.");
			return true;
		}else {
			System.out.println("Invalid Last Name.");
			return false;		}
	}
	
	//For Email Id
	public boolean validateEmail(String email) {
		String pattern = "^[a-z]+[.a-z]*@[a-z]+[.a-z]+[.a-z]*$";
		
		if(email.matches(pattern)) {
			System.out.println("Valid E-Mail Id.");
			return true;
		}else {
			System.out.println("Invalid E-Mail Id.");
			return false;		}
	}
	
	//for Mobile No
	public boolean validateMobileNo(String mobileNo) {
		String pattern = "^(91)?\\s[0-9]{10}$";
		
		if(mobileNo.matches(pattern)) {
			System.out.println("Valid Mobile No.");
			return true;
		}else {
			
			System.out.println("Invalid Mobile No.");
			return false;
		}
	}
	
	//For password rule no 4
	public boolean validatePassward(String passward) {
		String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])(?=.*[a-z]).{8,}$";
		
		if(passward.matches(pattern)) {
			System.out.println("Valid Passward.");
			return  true;
		}else{
			System.out.println("Invalid Passward.");
			return false;
		}
	}
	
	//For sample E-Mail Id
	public void validSampleEmailId(String email) {
		String pattern = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		
		if(email.matches(pattern)) {
			System.out.println("Valid E-Mail Id.");
		}else {
			System.out.println("Invalid E-Mail Id.");
		}
	}
}
