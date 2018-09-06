package com.cg.cake.dao;

import java.util.HashMap;
/**
 * Class Name :CakeDao
 * Interface implemented :ICakeDao
 * No. of methods: 2
 * 
 * Name of Methods:placeOrder, getOrderDetails
 * Purpose : Data Access Operation
 * 
 * Author: Divya
 * Date of Creation : 10-07-2018
 * 
 */
import java.util.Random;

import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.db.CakeDb;
import com.cg.cake.db.CustomerDb;
import com.cg.cake.exception.CakeException;

public class CakeDao implements ICakeDao {
	
	// use this statement to create map without cake db and same for custmap
	// private Static Map<Integer,CakeOrder> orderMap=new HashMap<Integer,CakeOrder>();
	
	static HashMap<Integer, CakeOrder> orderMap= CakeDb.getCakeDb();
	static HashMap<Integer, Customer> custMap= CustomerDb.getCustomerDb();
	Random rand=new Random();
	/**
	 * Name of Method : placeOrder
	 * Parameter expected customer object ,CakeOrder Object
	 * return type : int, orderId
	 * Author : Divya
	 * Date of Creation :10-07-2018
	 * Purpose :to update order details
	 */
	@Override
	public int placeOrder(Customer customer, CakeOrder cake) throws CakeException {
		int id=rand.nextInt(1000);
		customer.setCustomerId(id);
		custMap.put(customer.getCustomerId(), customer);
		
		int id1=rand.nextInt(1000);
		cake.setOrderId(id1);
		
		orderMap.put(cake.getOrderId(),cake);
		
		return cake.getOrderId();
	}

	@Override
	public CakeOrder getOrderById(int id) throws CakeException {
		CakeOrder req=orderMap.get(id);
		if(req==null)
		{
			throw new CakeException("Request with id "+id+" does not exist");
		}
		return req;
	}
	

	
	

}
