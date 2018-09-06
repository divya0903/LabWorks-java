package arrays;

public class Student {
	int id;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
