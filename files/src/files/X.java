package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class X {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:/data.txt");
		FileOutputStream fos=new FileOutputStream("d:/data.txt");
		
		/*DataOutputStream out=new java.io.DataOutputStream(fos);
		int i=10;
		double d=45.23;
		boolean b=true;
		String str="divya gurumanchi";
		// to write data to a file
		out.writeInt(i);
		out.writeDouble(d);
		out.writeBoolean(b);
		out.writeUTF(str);
		
		System.out.println("data written");*/
		
		DataInputStream in=new DataInputStream(fis);
		int num=in.readInt();
		double dvalue=in.readDouble();
		boolean bvalue=in.readBoolean();
		String s=in.readUTF();
		System.out.println(num+" "+dvalue+" "+bvalue+" "+s);
	}

}
