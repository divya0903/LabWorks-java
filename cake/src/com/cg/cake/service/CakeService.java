package com.cg.cake.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



import com.cg.cake.bean1.CakeOrder;
import com.cg.cake.bean2.Customer;
import com.cg.cake.dao.CakeDao;
import com.cg.cake.dao.ICakeDao;
import com.cg.cake.exception.CakeException;

public class CakeService implements ICakeService {
	
	ICakeDao cakeDao= new CakeDao();
	
	@Override
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeException {
	
		return cakeDao.placeOrder(customer, cake);
	}
	
	public double caketype(String type) throws CakeException{
		 double cost;
		FileInputStream fis=null;	
	
		try {
			fis = new FileInputStream("cake.properties");
			Properties p = new Properties();
			p.load(fis);
			if(!p.containsKey(type))
			 {
				throw new CakeException("Cake flavour does not exist");
			}
			
			cost=Double.parseDouble(p.getProperty(type));
			
		
			
		} catch (FileNotFoundException e) {
			throw new CakeException("An error occured "+e.getMessage());
		} catch (IOException e) {
			throw new CakeException("An error occured "+e.getMessage());
		}finally{
			try{
				if(fis!=null)
				{
				fis.close();
				}
			}catch(IOException e)
			{
				throw new CakeException("An error Occured "+e.getMessage());
			}
			
		}
		return cost;
	}

	@Override
	public boolean validatePhone(String phn) throws CakeException {
		if(!phn.matches("\\d{10}"))
		{
			throw new CakeException("Phone number should contain 10 digits");
		}
		return true;
	
	}

	@Override
	public CakeOrder getOrderById(int id) throws CakeException {
		
		return cakeDao.getOrderById(id);
	}

	
	

}
