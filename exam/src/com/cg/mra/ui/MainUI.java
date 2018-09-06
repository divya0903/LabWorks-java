package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;
/**
 * class name: MainUI
 * No. of methods: 2
 * Method name: 1.public void accountBalanceEnquiry()
 * 				2.public void rechargeAccount() 
 * @author gudivya
 * Date of Creation :11-07-2018
 *
 */

public class MainUI {
	Scanner scan=new Scanner(System.in);
	AccountService service=new AccountServiceImpl();
	

	public static void main(String[] args) {
		System.out.println("------Mobile Recharge Application-------");
		MainUI main=new MainUI();
		String option="";
		while(true)
		{
			System.out.println();
			System.out.println("1. Account Balance Enquiry");
			System.out.println("2. Recharge Account");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			option=main.scan.nextLine();
			switch(option)
			{
			case "1":main.accountBalanceEnquiry();
					break;
			case "2":main.rechargeAccount();
				break;
			case "3":
					main.scan.close();
					System.exit(0);
				break;
			}
		}
	}
	/**
	 * Name of Method : accountBalanceEnquiry()
	 * return type : void
	 * Author : Divya
	 * Date of Creation :11-07-2018
	 * Purpose :to get check the balance 
	 */
	public void accountBalanceEnquiry()
	{
		System.out.print("Enter mobile number: ");
		String mobile=scan.nextLine();
		
		try {
			Account balance=service.getAccountDetails(mobile);
			System.out.println();
			System.out.println("Your Current Balance is: "+balance.getAccountBalance());
		} catch (MobileException e) {
			System.out.println();
			System.out.println("ERROR: Given Account ID Does Not Exists");
			System.out.println();
		}
		
	}
	/**
	 * Name of Method :rechargeAccount() 
	 * return type : void
	 * Author : Divya
	 * Date of Creation :11-07-2018
	 * Purpose :to update the balance after recharging 
	 */
	public void rechargeAccount() 
	{

		try {
			System.out.print("Enter mobile Number: ");
			String mobile=scan.nextLine();
			Account details=service.getAccountDetails(mobile);
			if(!mobile.contains(details.getMobileNo()))
			{
				throw new MobileException();
			}
			boolean result=service.validatePhone(mobile);
			if(result)
			{
			
			System.out.print("Enter recharge Amount: ");
			double amount=Double.parseDouble(scan.nextLine());
			boolean result1=service.validateRechargeAmount(amount);
			if(result1)
			{
			double amount1=service.rechargeAccount(mobile, amount);
			details.setAccountBalance(amount1);
			System.out.println();
			System.out.println("Your Account Recharged Successfully");
			System.out.println("Hello "+details.getCustomerName()+", Available Balance is "+amount1);
			}
			}
		} catch (MobileException e) {
			System.out.println();
			System.err.println("ERROR: Cannot Recharge Account As Given Mobile No. Does Not Exist");
			System.out.println();
		}
		System.out.println();
	}

}
