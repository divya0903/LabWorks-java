package collec;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	String pid,pname;

	public Person(String pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public int compare(Person o1, Person o2) {
		String name1=o1.pname;
		String name2=o2.pname;
		//int st=name1.compareTo(name2);// prints 2nd details
		int st=name2.compareTo(name1);
		return st;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
