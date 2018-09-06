package dumps;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short s =20;//2 bytes
		//-128 to 127
		// 1000
		int i=1234;//4 bytes
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String i1="1234";
		
		int iii=Integer.parseInt(i1);// to convert string to int
		float fff=Float.parseFloat(i1);// string to float
		//xxxx.parseXXX(value); to get back to string
		String bin= Integer.toBinaryString(1234);
		bin=Integer.toHexString(1234);
		bin=Integer.toOctalString(1234);
		
		int max= Integer.max(10, 20);
		int min= Integer.min(10, 20);
		
		
		
		//Integer i1=new Integer(i);//converting primitive to object// boxing
		Integer i2=new Integer(i1);
		Integer j1=Integer.valueOf(i);
		//Float fff=Float.ValueOf(12.34f);
		int z1=j1.intValue();// unboxing
		int pp=Integer.parseInt(i1);
		long l=1234567890;//8 bytes
		float f=12.34f;//4 bytes
		double d=1234.4567;//8 bytes
		
		char gender='b';// 2 bytes
		String name="divya";
		System.out.println("b "+b);
		System.out.println("s "+s);
		System.out.println("i "+i);
		System.out.println("l "+l);
		System.out.println("f "+f);
		System.out.println("d "+d);
		System.out.println("gender "+gender);
		System.out.println("name " +name);
		boolean st=false;
		
		Character ch=Character.valueOf('M');
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isUpperCase(ch));
		//  implicit
		System.out.println("after implicit type casting");
		s=b;
		i=s;
		l=i;
		f=i;
		System.out.println("s "+s);
		System.out.println("i "+i);
		System.out.println("l "+l);
		System.out.println("f "+f);
		
		//explicit
		s=(short) gender;
		i=gender;// stored ascii value
		//i=f;// cannot store float in inter
		i=(int)f; //converts float to int
		//s=i;//4 bytes cannot be stored into 2 bytes
		s=(short)i;// converts 4 to 2 bytes
		//b=s;
		b=(byte)s;
		System.out.println("after explicit type casting");
		System.out.println("s "+s);
		System.out.println("i "+i);
		System.out.println("i "+i);
		System.out.println("s "+s);
		System.out.println("b "+b);
	}

}
