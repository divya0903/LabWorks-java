package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Demo_main {

	public static void main(String[] args) throws IOException  {
		FileInputStream in= new FileInputStream("demo.properties");
		Properties props= new Properties();
		
		props.load(in);
		System.out.println(props.getProperty("name"));
		System.out.println(props.getProperty("company"));
		//System.out.println(props.getProperty("company1","not specified"));
		//if given option is not found its gives not specified
		System.out.println(props.getProperty("city"));
		System.out.println(props.getProperty("state"));
		
		FileOutputStream out= new FileOutputStream("copy.properties");
		//props.store(out,"duplicate file for demo. properties file");
		 
		PrintStream ps= new PrintStream(out);
		props.list(ps);
	}

}
