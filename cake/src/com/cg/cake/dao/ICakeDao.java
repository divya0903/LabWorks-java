package com.cg.cake.dao;


import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.exception.CakeException;



public interface ICakeDao {
	
	int placeOrder(Customer customer, CakeOrder cake) throws CakeException;
	
	CakeOrder getOrderById(int id) throws CakeException;
	
}
