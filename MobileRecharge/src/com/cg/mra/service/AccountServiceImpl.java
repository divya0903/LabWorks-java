package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.MobileException;
/**
 * class name: AccountServiceImpl
 * No. of methods: 4
 * Method name: 1. public Account getAccountDetails(String mobileNo) throws MobileException {}
 * 				2. public int rechargeAccount(String mobileNo, double rechargeAmount)throws MobileException {}
 * 	
 * 				3. boolean validatePhone(String mobile) throws MobileException {}
 * 				4. boolean validateRechargeAmount(double rechargeAmount) throws MobileException{}
 * @author gudivya
 * Date of Creation :11-07-2018
 *
 */

public class AccountServiceImpl implements AccountService {
	AccountDao dao=new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) throws MobileException {
		
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount)
			throws MobileException {
		
		
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}
	
	@Override
	public boolean validatePhone(String mobile) throws MobileException {
		
		if(!mobile.matches("\\d{10}"))
		{
			throw new MobileException("Mobile number should contain 10 digits");
		}
		
		
		return true;
	}
	public boolean validateRechargeAmount(double rechargeAmount) throws MobileException{
		if(rechargeAmount<=0)
		{
			throw new MobileException("recharge amount is invalid"); 
		}
	return true;	
	}
	
}
