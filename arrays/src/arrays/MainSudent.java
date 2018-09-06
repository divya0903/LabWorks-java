package arrays;

public class MainSudent {

	public static void main(String[] args) {
		Student srr[]=new Student[3];
		srr[0]=new Student(1,"divya");
		srr[1]=new Student(2,"bharu");
		srr[2]=new Student(3,"subhu");
		
	for(Student i:srr)
	{
		System.out.println(i);
	}
	
	
	}

}
