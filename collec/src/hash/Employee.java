package hash;

public class Employee {
String name,email,company;
public Employee(String name, String email, String company, int id) {
	super();
	this.name = name;
	this.email = email;
	this.company = company;
	this.id = id;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((company == null) ? 0 : company.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	boolean flag=false;
	Employee e = (Employee) obj;
	Employee current=this;
	if(e.email.equals(current.email) && 
	    e.company.equals(current.company))
	{
		flag=true;
	}
	return flag;
}
int id;
}
