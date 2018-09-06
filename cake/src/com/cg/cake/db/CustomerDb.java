package com.cg.cake.db;

import java.util.HashMap;

import com.cg.cake.bean2.Customer;

public class CustomerDb {
	private static HashMap<Integer, Customer> customerDb = new HashMap<Integer, Customer>();
	
	public static HashMap<Integer, Customer> getCustomerDb() {
		return customerDb;
	}
}
