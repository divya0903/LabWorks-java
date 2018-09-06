package com.cg.mra.db;

import java.util.HashMap;

import com.cg.mra.beans.Account;

public class AccountDb {
	
	
	private static HashMap<String, Account> accDb=new HashMap<String, Account>();
	public static HashMap<String, Account> getAccDb()
	{
		return accDb;
	}
	static
	{
		accDb.put("8121414689", new Account("8121414689","privilage","divya",500));
		accDb.put("9666621846", new Account("9666621846", "privilaged", "jeevana", 300));
		accDb.put("9701508788", new Account("9701508788", "privilaged", "preethi", 800));
		
	}
	
	

}
