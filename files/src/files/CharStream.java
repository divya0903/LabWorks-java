package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file =new File("d:/test.txt");
		FileReader fr = new FileReader("d:/test.txt");
		//fr.skip(3);// skips 3 characters 
		/*int c;
		while ((c = fr.read()) != -1) {
			System.out.print((char) c);
		}*/
		// read or write in simple way
		/*char[] arr=new char[(int)file.length()];
		fr.read(arr);
		System.out.println(arr);*/
		FileWriter fw = new FileWriter("d:/writer.txt");
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
			fw.flush();
			System.out.print((char) c);
		}
		
	}

}
