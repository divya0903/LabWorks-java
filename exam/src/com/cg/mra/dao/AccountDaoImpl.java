package com.cg.mra.dao;

import java.util.Collection;
import java.util.HashMap;

import com.cg.mra.beans.Account;
import com.cg.mra.db.AccountDb;
import com.cg.mra.exception.MobileException;
/**
 * class name: AccountDaoImpl
 * No. of methods: 2
 * Method name: 1. public Account getAccountDetails(String mobileNo) throws MobileException{}
 * 				2. public int rechargeAccount(String mobileNo, double rechargeAmount){}
 * @author gudivya
 * Date of Creation :11-07-2018
 *
 */

public class AccountDaoImpl implements AccountDao {
	HashMap<String,Account> accMap=AccountDb.getAccDb();

	/**
	 * Name of Method : getAccountDetails
	 * Parameter expected mobile number
	 * return type : account object
	 * Author : Divya
	 * Date of Creation :11-07-2018
	 * Purpose :to get account details
	 */
	@Override
	public Account getAccountDetails(String mobileNo) throws MobileException{
		Account acc=accMap.get(mobileNo);
		if(acc==null)
		{
			throw new MobileException("ERROR: Given Account does not exist");
		}
		return  acc;
		
	}
	/**
	 * Name of Method : rechargeAmount
	 * Parameter expected String mobileNumber, double RechargeAmount
	 * return type : int, amount
	 * Author : Divya
	 * Date of Creation :11-07-2018
	 * Purpose :to update recharge amount
	 */

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount)
			throws MobileException {
		Account acc=accMap.get(mobileNo);
		double amount=0;
		amount=rechargeAmount+acc.getAccountBalance();
		
		return (int) amount;
	}

}
