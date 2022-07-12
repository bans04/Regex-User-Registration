package com.regex;
import java.util.Scanner;
/*
 * For First Name:-> As a User need to enter a valid First Name.
 * For last name:-> As a User need to enter a valid First Name.
 * For E-Mail Id:-> As a User need to enter a valid email.
 * For Password
 * 
 * @Dnyandeo Bansode
 * 11/07/2022
 * 
 * */
public class RegexMain {

	public static void main(String[] args) {
		Regex regex = new Regex();
		Scanner scanner = new Scanner(System.in);
		
	/*	System.out.print("Enter First Name:-> ");
		String firstName = scanner.next();
		regex.validateFirstName(firstName);
		
		System.out.print("Enetr Last Name:-> ");
		String lastname = scanner.next();
		regex.validateLastName(lastname);
		
		System.out.print("Enter E-Mail Id:-> ");
		String email = scanner.next();
		regex.validateEmail(email);
		
		System.out.print("Enter Mobile No:-> ");
		String mobileNo = scanner.next();
		regex.validateMobileNo(mobileNo);
		
		System.out.print("Enter Passward:-> ");
		String passward = scanner.next();
		regex.validatePassward(passward);*/
		
		regex.validSampleEmailId("abc@yahoo.com");
		regex.validSampleEmailId("abc-100@yahoo.com");
		regex.validSampleEmailId("abc.100@yahoo.com");
		regex.validSampleEmailId("abc111@abc.com");
		regex.validSampleEmailId("abc-100@abc.net");
		regex.validSampleEmailId("abc.100@abc.com.au");
		regex.validSampleEmailId("abc@1.com");
		regex.validSampleEmailId("abc@yahoo.com.com");
	}
}
