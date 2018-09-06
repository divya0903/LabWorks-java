package com.cg.cake.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.exception.CakeException;

public class ICakeDaoTest {
	ICakeDao dao;
	@Before
public void init()
{
	dao=new CakeDao();
}
	@Test
	public void testPlaceOrder() throws CakeException {
		Customer c=new Customer();
		CakeOrder o=new CakeOrder();
		o.setTotalPrice(500);
		dao.placeOrder(c, o);
		
	}

	@Test
	public void testGetOrderById() throws CakeException {
		int orderId = 0;
	//CakeOrder o=dao.getOrderById(100);
	assertNull(dao.getOrderById(orderId));
	}
public void testException() throws CakeException{
	dao.getOrderById(100);
}
}
