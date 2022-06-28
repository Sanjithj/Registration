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
		        
		        System.out.println("Enter Your Last Name");
		        String lastName = scannerObject.next();
		        checkValidLastName(lastName);
		        
		        System.out.println("Enter Your Email Address");
		        String email = scannerObject.next();
		        checkValidEmail(email);
		        
		        System.out.println("Enter Your Mobile Number");
		        String mobileNumber = scannerObject.next();
		        checkMobileNumber(mobileNumber);

		        System.out.println("Enter the Password");
		        String password = scannerObject.next();
		        checkPassword(password);
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
		            System.out.println(firstName+  " Invalid First Name");
		    }    
	
			public static void checkValidLastName(String lastName) {
		
		    boolean isLastName;
		    String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
		    Pattern patternObject = Pattern.compile(lastNameRegex);
		    if (lastName == null) {
		        isLastName = false;
		    }
		    Matcher matcherObject = patternObject.matcher(lastName);
		    isLastName = matcherObject.matches();
		
		    if (isLastName)
		        System.out.println(lastName + " Valid Last Name");
		    else
		        System.out.println(lastName + "  Invalid Last Name");
		}
			
			 public static void checkValidEmail(String email){

			        boolean isEmail;
			        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			        Pattern patternObject = Pattern.compile(emailRegex);
			        if (email == null) {
			            isEmail = false;
			        }
			        Matcher matcherObject = patternObject.matcher(email);
			        isEmail =  matcherObject.matches();

			        if(isEmail)
			            System.out.println(email+"  Valid Email\n");
			        else
			            System.out.println(email+"  Invalid Email ");
			    }

			 public static void checkMobileNumber(String mobileNumber){

			        boolean isMobileNumber;
			        String mobileNumberRegex = "(91)?[7-9][0-9]{9}";
			        Pattern patternObject = Pattern.compile(mobileNumberRegex);
			        if (mobileNumber == null) {
			            isMobileNumber = false;
			        }
			        Matcher matcherObject = patternObject.matcher(mobileNumber);
			        isMobileNumber =  matcherObject.matches();

			        if(isMobileNumber)
			            System.out.println(mobileNumber+ "  Valid  Mobile Number\n");
			        else
			            System.out.println(mobileNumber+ "   Invalid Mobile Number");
			    }
			 public static void checkPassword(String password){

			        boolean isPassword;
			        String passwordRegex = "^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is  Valid\n");
			        else
			            System.out.println(password+"   Password is Invalid");
			    }
			 public static void checkUppercase(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is  Valid\n");
			        else
			            System.out.println(password+"  Password is Invalid");
			    }
			 public static void checkNumeric(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is Valid \n");
			        else
			            System.out.println(password+"   Password is Invalid");
			    }
			 
			 public static void checkSpecialchar(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"  Password is Valid\n");
			        else
			            System.out.println(password+"  Password is InValid");
			    }

}

