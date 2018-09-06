package dumps;

import java.util.ArrayList;

public class Y {
	private static int letter;
	//public static int getletter(); // gives error as there is no method body 
	/*{
		System.out.println("letter");
		return 1;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] table={"aa", "bb", "cc"};
		/*int ii=0;
		do
			while(ii<table.length)
				System.out.println(ii++);
		while(ii<table.length);
		System.out.println("*****************");*/
		int ii=0;
		for(String ss: table)
		{
			
			while(ii<table.length){
				
				System.out.println(ii);
				ii++;
				break;
			}
		}
		ArrayList<Integer> list = new ArrayList<>(1);
		 list.add(1001);
		 list.add(1002);
		 list.add(1003);
		 System.out.println(list.get(list.size()));
		//System.out.println(ii);
		//System.out.println(getletter());// goves error as there is no body in getletter
	}
	
}
