package com.cg.cake.service;

import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.exception.CakeException;

public interface ICakeService {
	int placeOrder(Customer customer, CakeOrder cake) throws CakeException;
	
	boolean validatePhone(String phn) throws CakeException;
	
	CakeOrder getOrderById(int id) throws CakeException;
	
	public double caketype(String type) throws CakeException;

}
