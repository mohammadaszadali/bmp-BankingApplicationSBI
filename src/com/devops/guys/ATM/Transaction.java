package com.devops.guys.ATM;

import java.util.Scanner;

import com.devops.guys.ATM.*;

public class Transaction {
	
	Scanner sc = new Scanner(System.in);
	
	int initial_balance = 500;
	int total_amount;
	int available_balance;
	
	public int deposit() {  
		
		int amount;
		System.out.println("please enter the deposit amount:");
		amount = sc.nextInt();
		total_amount = initial_balance + amount;
		return total_amount;
		
}
	
	 public int withdrawal() {  
	       
	      int withdrawal;
	        System.out.println("Enter the amount you want to withdraw: ");  
	         withdrawal= sc.nextInt();
	        if (total_amount >= withdrawal) {  
	             available_balance = total_amount - withdrawal;  
	            System.out.println("Balance after withdrawal: " + available_balance);  
	        } 
	        else {  
	            System.out.println("Your balance is less than " + withdrawal + "\tTransaction failed...!!" );  
	        }  
	        return available_balance;
	    } 
	 
	 
}