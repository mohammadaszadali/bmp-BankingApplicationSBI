package com.devops.guys.ATM;

import java.util.Scanner;

public class PinGenerator {
	
	//Method To Generate the PIN for ATM
	public String pin_Number;
	public String pin_Number_confarmation;
	public String generate_pin()
	{
		System.out.println("Please enter the pin:");
		Scanner sc = new Scanner(System.in);
		pin_Number=sc.next();
		int len = pin_Number.length();
		System.out.println("Please confirm the pin:");
		pin_Number_confarmation = sc.next();
		int len_check = pin_Number.length();
		if(pin_Number.equals(pin_Number_confarmation))
		{
			System.out.println("Both pins are matched");
		//System.out.println(len);
		if (len < 4 ||len > 4 )
        {
		System.out.println("Invalid pin");
        }
		else 
		{
			System.out.println("New pin Generated successfully");
		}
        }
		else 
		{
			System.out.println("Both Pins are not matched");
		}
		
		return pin_Number;
	}
	}


