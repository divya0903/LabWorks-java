package com.cg.mra.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.exception.MobileException;

public class TestDao {
   AccountDao dao;
   Account acc;
	@Test
	public void testRechargeAccount() throws MobileException {
		assertNull(dao.rechargeAccount(acc.getMobileNo(), acc.getAccountBalance()));
	}

}
