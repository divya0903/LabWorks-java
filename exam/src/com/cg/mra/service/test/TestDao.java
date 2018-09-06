package com.cg.mra.service.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.MobileException;

public class TestDao {
   AccountDao dao;
   Account acc;
   
	@Test
	public void testRechargeAccount() throws MobileException {
		
		assertNotNull(dao.rechargeAccount(acc.getMobileNo(), acc.getAccountBalance()));
		
	}
	
   /*@Before
   public void init()
   {
	   dao=new AccountDaoImpl();
   }

   @Test
   public void testRechargeAccount() throws MobileException {
	   
	   String mobile="8121414689";
	   double amt=200;
	   assertNotNull(dao.rechargeAccount(mobile, amt));
	   assertEquals(700, dao.rechargeAccount(mobile, amt));
   }*/
}
