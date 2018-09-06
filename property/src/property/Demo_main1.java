package property;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Demo_main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		Properties p=new Properties();
		p.setProperty("101", "divya");
		p.setProperty("102", "manu");
		p.setProperty("103", "ponnu");
		//p.remove("102");
		FileOutputStream out=new FileOutputStream("names.properties");
		
		p.store(out, "details of names");
		// to display the elements in console using enum type
		Enumeration<Object> e=p.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		/*Enumeration e1=p.propertyNames();
		while(e.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}*/
		//gives key values
		Set<String> s=p.stringPropertyNames();
		System.out.println(s);
		System.out.println(s.size());
		out.close();
		System.out.println("done !!");
		
		
	}

}
