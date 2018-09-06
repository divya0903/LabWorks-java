/**
 * 
 */
package login;

/**
 * @author gudivya
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to multiply
		Multiply obj=new Multiply();
		int x= obj.mul(10,20);
		System.out.println(x);
		
		// to display
		System.out.println("hello world");
		
		// to add
		Calc ob=new Calc();
		int y= ob.add(10,20);
		System.out.println(y);
		
		Multiply b=new Multiply();
		b.print();
		
		// to subtract
		Calc o=new Calc();
		int z= o.sub(20,10);
		System.out.println(z);

	}

}
