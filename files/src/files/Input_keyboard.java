package files;

import java.io.IOException;

public class Input_keyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		System.out.println("enter some data you like");
		int c;
		while((c=System.in.read())!='\n')
		{
			sb.append((char)c);
		}
		System.out.println("you entered "+sb);
	}

}
