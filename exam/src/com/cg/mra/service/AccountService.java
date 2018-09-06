package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileException;

public interface AccountService {
	Account getAccountDetails(String mobileNo) throws MobileException;
	int rechargeAccount(String mobileNo,double rechargeAmount) throws MobileException;
	public boolean validatePhone(String mobile) throws MobileException;
	public boolean validateRechargeAmount(double rechargeAmount) throws MobileException;

}
