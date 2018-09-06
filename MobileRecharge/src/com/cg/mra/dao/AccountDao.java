package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileException;


public interface AccountDao {
	Account getAccountDetails(String mobileNo) throws MobileException;
	
	int rechargeAccount(String mobileNo,double rechargeAmount) throws MobileException;

}
