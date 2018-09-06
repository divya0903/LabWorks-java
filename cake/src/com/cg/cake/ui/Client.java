package com.cg.cake.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.exception.CakeException;
import com.cg.cake.service.CakeService;
import com.cg.cake.service.ICakeService;

public class Client {
	Scanner sc=new Scanner(System.in);
	ICakeService cakeService=new CakeService();
	public static void main(String[] args) {
		System.out.println("------cake order-------");
		Client c=new Client();
		String opt="";
		while(true)
		{
			System.out.println();
			System.out.println("1. Place order");
			System.out.println("2. Display order");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			opt=c.sc.nextLine();
			switch(opt)
			{
			case "1":
					c.placeOrder();
					break;
			case "2":
					c.displayOrder();
					break;
			case "3":
					c.sc.close();
					System.exit(0);
					break;
			default :
					System.out.println("Please select option between 1 and 3");
			
			}
		}

	}
	public void placeOrder()
	{
		Customer cust=new Customer();
		CakeOrder order=new CakeOrder();
		System.out.println();
		System.out.print("Enter customer name : ");
		cust.setCustName(sc.nextLine());
		System.out.print("Enter customer address : ");
		cust.setAddress(sc.nextLine());
		System.out.print("Enter customer phone number : ");
		cust.setPhone(sc.nextLine());
		System.out.print("Enter the cake flavour : ");
		String type=sc.nextLine();
		try {
			boolean result=cakeService.validatePhone(cust.getPhone());
			if(result)
			{
				double price=cakeService.caketype(type);
				double totalCost=price+500.0;
				order.setTotalPrice(totalCost);
				System.out.println("Price : "+order.getTotalPrice());
				System.out.println("Order date :"+LocalDate.now());
				int ret=cakeService.placeOrder(cust,order);
				System.out.println("Cake Order successfully placed with Order Id : "+ret);
				System.out.println();
				
			}
		} catch (CakeException e) {
			System.out.println();
			System.err.println("An error occured "+e.getMessage());
			System.out.println();
		}
	}
	public void displayOrder()
	{
		System.out.print("Enter Order id : ");
		int id =Integer.parseInt(sc.nextLine());
		try {
			CakeOrder cust1=cakeService.getOrderById(id);
			System.out.println("Order ID "+cust1.getOrderId());
			System.out.println("Customer ID "+cust1.getCustomerId());
			System.out.println("total price "+cust1.getTotalPrice());
			System.out.println();
		} catch (CakeException e) {
			System.out.println();
			System.err.println("An error occured "+e.getMessage());
			System.out.println();
		}
	}

}
