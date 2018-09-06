package collec;

import hash.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ListDemo {

	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<>();
	l1.add(123);
	l1.add(563);
	l1.add(50);
	l1.add(12);
	l1.add(89);
	System.out.println("l1 "+l1);
	ArrayList<Integer> l2=new ArrayList<>();
	
	l2.add(123);
	l2.add(563);
	l2.add(50);
	l2.add(45);
	l2.add(61);
	System.out.println("l2 "+l2);
	
	l1.addAll(l2);//union
	System.out.println("union list "+l1);

	l1.retainAll(l2);// intersection of l1 and l2
	System.out.println("retain list "+l1);
	
	System.out.println("list with duplicate "+l1);
	HashSet<Integer> hs=new HashSet<>();
	hs.addAll(l1);
	System.out.println("list as set without duplicates "+hs);
	
	HashSet<String> nameset=new HashSet<>();
	nameset.add("divya");
	nameset.add("bharu");
	nameset.add("kavs");
	nameset.add("subhu");
	nameset.add("sri");
	boolean p= nameset.add("nandy");
	System.out.println("before removing "+nameset);
	System.out.println("nandy is added or not "+p);
	nameset.remove("sri");
	System.out.println("after removing "+nameset);
	
	TreeSet<String> tset= new TreeSet<String>();
	tset.add("jeevs");
	tset.add("preethi");
	tset.add("priya");
	tset.add("jhanu");
	System.out.println(tset);//prints name in alphabetic order
	//comparable
	TreeSet<Student> ts=new TreeSet<>();
	ts.add(new Student("1","divya"));
	ts.add(new Student ("2","gurumanchi"));
	System.out.println(ts);
	
	//comparator
	TreeSet<Person> ts1=new TreeSet<>(new Person(" "," "));
	ts1.add(new Person("1","divya"));
	ts1.add(new Person("2","bharathi"));
	System.out.println(ts1);
	
	//comparing using hashcode
	Employee e1=new Employee("divya","divya@gmail.com","capgemini",123);
	System.out.println(e1.hashCode());
	Employee e2=new Employee("jeevana","jeevana@gmail.com","capgemini",125);
	System.out.println(e2.hashCode());
	Employee e3=new Employee("divya jyothi","divya@gmail.com","capgemini",125);
	System.out.println(e3.hashCode());
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	}
}
