package dumps;

public class P {

	public static void main(String[] args) {
		Q asc=new Q();
		P sc=new P();
		sc=asc;// comment it and excute for another output
		
		System.out.println("sc "+sc.getClass());
		System.out.println("asc "+asc.getClass());
	}

}
class Q extends P{

}
