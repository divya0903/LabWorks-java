package com.cg.booking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;
import com.cg.booking.service.BookingService;
import com.cg.booking.service.IBookingService;

public class Client {
	Scanner sc=new Scanner(System.in);
	IBookingService bookingService=new BookingService();

	public static void main(String[] args) {
		System.out.println("---------Booking App----------");
		Client c=new Client();
		String opt="";
		while(true)
		{
			System.out.println();
			System.out.println("1. Raise a cab request");
			System.out.println("2. View cab request Status");
			System.out.println("3. Exit");
			opt=c.sc.nextLine();
			switch(opt)
			{
			case "1":
					c.addRequest();
					break;
			case "2":
					c.displayRequest();
					break;
			case "3":
					System.exit(0);
					break;
			default :
					System.out.println("Please select option between 1 and 3");
			}
		}
	}
	public void addRequest()
	{
		Request req=new Request();
		System.out.println("Enter customer name");
		req.setCustomerName(sc.nextLine());
		System.out.println("Enter phone number");
		req.setPhn(sc.nextLine());
		System.out.println("Enter pickup address");
		req.setAddressOfPickup(sc.nextLine());
		System.out.println("Enter pincode");
		req.setPincode(sc.nextLine());
		req.setRequestStatus("Not Accepted");
		req.setDateOfRequest(LocalDate.now());
		try {
			boolean result=bookingService.validateRequest(req);
			if(result)
			{
				int ret=bookingService.addRequest(req);
				System.out.println("Request with id "+ret+" is added sucessfully");
				
			}
		} catch (BookingException e) {
			System.out.println();
			System.err.println("An error occured "+e.getMessage());
			System.out.println();
		}
		
	}
	public void displayRequest()
	{
		System.out.println("Enter request id");
		int id=Integer.parseInt(sc.nextLine());
		try {
			Request req=bookingService.getRequestByid(id);
			System.out.println("Customer name "+req.getCustomerName());
			System.out.println("Request Status "+req.getRequestStatus());
			System.out.println("Cab number "+req.getCabNumber());
			System.out.println("Request date "+req.getDateOfRequest());
			System.out.println("Pickup Address "+req.getAddressOfPickup());
			
		} catch (BookingException e) {
			System.out.println();
			System.err.println("An error occured "+e.getMessage());
			System.out.println();
		}
	}

}
