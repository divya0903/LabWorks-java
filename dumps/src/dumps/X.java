package dumps;

public class X {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int x1=x2;//gives error as x2 is not declared before this statement
		//int x2=j;// j is not declared
		/*boolean h = 1;
		 boolean k = 0;
		 boolean m = null;*/
		// above lines give error for boolean initialization
		 boolean j = (1 < 5);
		
		int [] [] array2D;
		//int [2] [2] array2D; gives error
		int a, b, c = 0;
		int x, y, z;
		int d, e, F;
		//Int k, l, m; = 0;// error
		//int g, int h, int i = 0;// error
		
		String msz1="hello";//gives really equal
		//String msz1= new String("hello");//gives really equal
		//String msz2= "hello";// gives equal and really equal  has same address as msz1
		
		String msz2= new String("hello");// gives really equal
		if(msz1==msz2)//checks refernce values i.e. address
		{
			System.out.println("equal");
		}
		if(msz1.equals(msz2))
		{
			System.out.println("really equal");
		}
		
		dosomething();
	}

	private static void dosomething() throws Exception  {
		// TODO Auto-generated method stub
		System.out.println("before if clause");
		double x=Math.random();
		System.out.println("x value "+x);
		if(x>0.5)
		{
			throw new Exception();
		}
		System.out.println("after if clause");
	}
	
}
