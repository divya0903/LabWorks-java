package com.cg.booking.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.cg.booking.bean.Request;
import com.cg.booking.dao.BookingDao;
import com.cg.booking.dao.IBookingDao;
import com.cg.booking.exception.BookingException;

public class BookingService implements IBookingService {

	IBookingDao bookingDao=new BookingDao();
	@Override
	public int addRequest(Request request) throws BookingException {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("pincode.properties");
			Properties p=new Properties();
			p.load(fis);
			String cabNo=p.getProperty(request.getPincode());
			if(cabNo!=null)
			{
				request.setRequestStatus("Accepted");
				request.setCabNumber(cabNo);
			}
		} catch (FileNotFoundException e) {
			throw new BookingException("An error occured "+e.getMessage());
		} catch (IOException e) {
			throw new BookingException("An error occured "+e.getMessage());
		}
		finally{
			try{
				if(fis!=null)
				{
				fis.close();
				}
			}catch(IOException e)
			{
				throw new BookingException("An error Occured "+e.getMessage());
			}
			
		}
		return bookingDao.addRequest(request);
	}
	@Override
	public boolean validateRequest(Request request) throws BookingException {
		if(validateName(request.getCustomerName()) && validatePhone(request.getPhn()) && validatePin(request.getPincode()))
		{
			return true;
		}
		
		return false;
	}
	private boolean validateName(String name) throws BookingException{
		if(name.isEmpty() || name==null)
		{
			throw new BookingException("Customer name cannot be empty");
		}
		else{
			if(!name.matches("[A-Z][A-Za-z\\s]{2,}"))
			{
				throw new BookingException("Name should start with capital letter and shouls contain only alphabets and spaces");
			}
		}
		return true;
	}
	private boolean validatePhone(String phn) throws BookingException{
		if(!phn.matches("\\d{10}"))
		{
			throw new BookingException("Phone number should contain 10 digits");
		}
		return true;
	}

	private boolean validatePin(String pincode) throws BookingException {
		if (!pincode.matches("\\d{6}")) {
			throw new BookingException("Pincode should contain 6 digits");
		}
		return true;
	}
	@Override
	public Request getRequestByid(int id) throws BookingException {
		
		return bookingDao.getRequestByid(id);
	}
	

}
