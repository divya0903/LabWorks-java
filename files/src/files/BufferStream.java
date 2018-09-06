package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class BufferStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("d:/test.txt");
		FileReader fr = new FileReader("d:/test.txt");
		
		BufferedReader br=new BufferedReader(fr);
		LineNumberReader rdr=new LineNumberReader(br);
		String str="";
		while((str=rdr.readLine())!=null)
		{
			System.out.println(rdr.getLineNumber()+" : "+str);
		}
	}

}
