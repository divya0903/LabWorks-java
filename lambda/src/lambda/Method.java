package lambda;


interface Greeting{
	String greet(char[] message);
}
public class Method {

	public static void main(String[] args) {
		
		char[] message={'d','i','v','y','a'};
		
		Greeting g= String::new;
		String str=g.greet(message);
		System.out.println(str);
		
	}

}
