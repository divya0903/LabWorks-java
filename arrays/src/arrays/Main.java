package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[]=new int []{1,2,3,4,5};
		
		int err[][][][]=new int[3][3][3][3];
		System.out.println(arr);// gives array address
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("****************");
		/*for(int k:arr)
		{
			System.out.println(arr[k]);
		}*/
		Number n[]=new Number[10];
		n[0]=new Integer(10);
		n[1]=new Float(12.6);
		n[2]=new Short((short)2);
		n[3]=new Double(14.766587);
		for(Number j:n)
		{
			System.out.println(j);
		}
		System.out.println("************");
		int crr[][] =new int[2][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				crr[i][j]=sc.nextInt();
				System.out.println(crr[i][j]);
			}
		}
		
	}

}
