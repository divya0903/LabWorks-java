package collec;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2=new ArrayList<>();// to geberate only integer list
		list2.add(1);
		list2.add(13456);
		list2.add(1456);
		System.out.println(list2);
		
		List list= new ArrayList();
		list.add(1);
		list.add("divya");
		list.add('G');
		list.add(12.35);
		list.add(true);
		list.addAll(list2);// to add list2 to list
		System.out.println(list);
		list.addAll(3, list2);// add from 3rd position
		System.out.println(list);
		
		/*int l=list.size();
		Object ele;
		Object Object;
		
		for(int i=0;i<1;i++)	
		 
		ele = list.get(i);
		
		Object Float;
		if(ele instanceof Float)
		
			 Float Object iv = ((String) Float).valueOf(ele.toString());
		*/
	}
		
	}


