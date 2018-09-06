package arrays;
import java.util.Arrays;
public class Sort {
	

	static void sort(int... s) {
	Arrays.sort(s);
	for(int i=0;i<s.length;i++)
		System.out.print(s[i]+" " );
		System.out.println();
	}
	public static void main(String[] arg) {
	sort(15,20,42,3,56,34);
	} }
