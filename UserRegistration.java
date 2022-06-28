package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration");
		
		{
			 Scanner scannerObject = new Scanner(System.in);

		        System.out.println("Enter Your First Name");
		        String firstName = scannerObject.next();
		        checkValidFirstName(firstName);
		 }
	    
	}
		
		    public static void checkValidFirstName(String firstName) {

		        boolean isFirstName;
		        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
		        Pattern patternObject = Pattern.compile(firstNameRegex);
		        
		        if (firstName == null) {
		            isFirstName = false;
		        }
		        Matcher matcherObject = patternObject.matcher(firstName);
		        isFirstName =  matcherObject.matches();

		        if(isFirstName)
		            System.out.println(firstName+  " Valid First Name");
		        else
		            System.err.println(firstName+  " Invalid First Name");
		    }    
	}
		   

