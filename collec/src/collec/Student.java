package collec;

import java.util.Comparator;

public class Student implements Comparable<Student> {
String id;
String name;


public Student(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

@Override
public int compareTo(Student second) {
	// TODO Auto-generated method stub
	String name=this.name;
	String name2=second.name;
	
	return name2.compareTo(name);//name 2 is printed first
	//return name.compareTo(name2);// if we want to print name 1 first
}

}
