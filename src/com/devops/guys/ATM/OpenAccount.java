package com.devops.guys.ATM;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class OpenAccount {
	
	public String account_Number;
	public int balance;
	public String account_type;
	public int mobile_Number;
	public String customer_Name;
	public String mobile_number_str=Integer.toString(mobile_Number);
	
	Scanner sc = new Scanner(System.in);
	

	public static boolean mobile_number_validation(String mobile_number_str)  
	{  
	Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
	//the matcher() method creates a matcher that will match the given input against this pattern  
	Matcher match = ptrn.matcher(mobile_number_str);  
	//returns a boolean value  
	return (match.find() && match.group().equals(mobile_number_str));  
	}  
	public void open_account()
	{
		System.out.println("please enter the accontNumber");
		account_Number=sc.next();
		System.out.println("please enter the account type");
		account_type = sc.next();
		System.out.println("please enter the mobilenumber");
		mobile_Number=sc.nextInt();
		if (mobile_number_validation(mobile_number_str))
		{
			System.out.println("Entered mobile Number is valid");
		}
		else
		{
			System.out.println("Provided Mobile Number is invalid");
		}
		System.out.println("please Provide the customer Name:");
		customer_Name=sc.next();
		
	}
public void show_Account_Details()
{
	System.out.println("Your Account Number is: "+account_Number);
	System.out.println("Your initial Balance: "+ balance);
	System.out.println("Your account type is : " + account_type);
	System.out.println("your Mobile Number is: "+mobile_Number);
	System.out.println("yours Name is: "+ customer_Name);
	
	
}
public boolean search_on_account_number(String account_Number) 
{
	 if(account_Number.equals(account_Number))
	 {
		 show_Account_Details();
		 return(true);
	 }
	 return (false);
}
}
