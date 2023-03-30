package com.devops.guys;

import java.util.Scanner;

import com.devops.guys.ATM.*;

public class Main {

	public static void main(String[] args) {
		
	/*	// Create object for ATM class
  PinGenerator pg = new PinGenerator();
  pg.generate_pin();
  //Object for open account class
  OpenAccount op = new OpenAccount();
  op.open_account();
  op.show_Account_Details();
  
  //object for Transaction class
  
  Transaction tc = new Transaction();
  int final_amount=tc.deposit();
  int available_balanace = tc.withdrawal();
  System.out.println("Total amount is :" + final_amount);
  System.out.println("Available balance is:"+ available_balanace);
  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number , How many user do you want to create ");
		int user_no=sc.nextInt();
		Transaction tc = new Transaction();
		OpenAccount oa[] = new OpenAccount[user_no];
		for(int i=0; i < oa.length; i++)
		{
			oa[i] = new OpenAccount();
			oa[i].open_account();
		}
		int option;
		 do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            option = sc.nextInt();
	            switch(option)
	            {
	            case 1:  
                    for (int i = 0; i < oa.length; i++) {  
                        oa[i].show_Account_Details();  
                    }  
                    break;  
	            
         case 2:  
             System.out.print("Please Enter The  account number which you to search: ");  
             String account_Number = sc.next();  
             boolean found = false;  
             for (int i = 0; i < oa.length; i++) {  
                 found = oa[i].search_on_account_number(account_Number);  
                 if (found) {  
                     break;  
                 }  
             }  
             if (!found) {  
                 System.out.println("Search failed! Account doesn't exist..!!");  
             }  
             break;  
         case 3:  
             System.out.print("Enter Account no. : ");  
             account_Number = sc.next();  
             found = false;  
             for (int i = 0; i < oa.length; i++) {  
            	 
                 found = oa[i].search_on_account_number(account_Number);  
                 if (found) {  
                	 int final_amount=tc.deposit();  
                	 System.out.println("\"Total amount is :\" + final_amount");
                     break;  
                 }  
             }  
             if (!found) {  
                 System.out.println("Search failed! Account doesn't exist..!!");  
             }  
             break;  
         case 4:  
             System.out.print("Enter Account No : ");  
             account_Number = sc.next();  
             found = false;  
             for (int i = 0; i < oa.length; i++) {  
                 found = oa[i].search_on_account_number(account_Number);  
                 if (found) {  
                	 int available_balanace = tc.withdrawal();
                	 System.out.println("Available balance is:"+ available_balanace);
                     break;  
                 }  
             }  
             if (!found) {  
                 System.out.println("Search failed! Account doesn't exist..!!");  
             }  
             break;  
         case 5:  
             System.out.println("See you soon...");  
             break;  
     }  
		
  }
		 
   while(option!= 5);
}
}
