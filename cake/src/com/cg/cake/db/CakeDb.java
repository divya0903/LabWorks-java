package com.cg.cake.db;

import java.util.HashMap;


import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;

public class CakeDb {
	
	private static HashMap<Integer, CakeOrder> cakeDb = new HashMap<Integer, CakeOrder>();
	
	
	
	public static HashMap<Integer, CakeOrder> getCakeDb() {
		return cakeDb;
	}
	
	
}
