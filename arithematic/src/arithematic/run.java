package arithematic;

public class run {
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		for(int a:arr)
		{
				System.out.println(a);
		}
		int a=10; 
		int b=20;
		int c=a+b;
		float d= a/(float)b;
	int day=1;
	switch(day)
	{
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	}
		System.out.println("the addition is " +c);
		System.out.println("the addition of "+a+" and "+b+" is " +c);
		System.out.println(d);
		
		int result= a--; // result=10
		System.out.println(result);
		System.out.println(a);
		
		int result1=a<<1;
		System.out.println(result1);
		a=a+b; // to store in a only
		
		int result2=a>>2;
		System.out.println(result2);
		int x=10, y=20;
		boolean status =x<y;
		System.out.println("status is "+status);
		if(status)
		{
			System.out.println("y is greater");
		}
		else
		{
			System.out.println("x is greater");
		}
	int age=18 , country=1 ,state=25;
	// all should satisfy take and operator else or operator
	//boolean count=age>=18 && country==1 && state==25
	//to simplify the condition store it in a new variable
	//if((age>=18 && country==1 ||)state==25) if state is optional
	if(age>=18 && country==1 && state==25)
	{
		System.out.println("can vote");
	}
	else
	{
		System.out.println("cannot vote");
	}
	for(int i=0;i<11;i++)
		System.out.println(i);
	int j=10;
	while(j <21)
	{
			System.out.println(j);
		j++;
	}
	do
	{
		
			System.out.println("do while");
	}while(j>10);
	
	}
}
