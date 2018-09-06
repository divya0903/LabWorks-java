package dumps;

public class Z {

	public static void main(String[] args) {
		
		/*int ii=2;
		do{
			System.out.println(ii);
		}while(ii);*/// int is converted to boolean instead of giving an expression
		
		/*while(--ii)// cannot conver to boolean
		{
			System.out.println(ii);
		}*/
		// cannot conver to boolean
		
		StringBuilder sb=new StringBuilder();
		String h1="helloworld";
		sb.append("hello").append("world");
		if(h1==sb.toString())//checks refernce values i.e. address
		{
			System.out.println("equal");
		}
		if(h1.equals(sb.toString()))
		{
			System.out.println("really equal");
		}
	}

}
