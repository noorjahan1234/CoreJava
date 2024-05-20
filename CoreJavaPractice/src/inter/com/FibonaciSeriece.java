package inter.com;

import java.util.Scanner;

public class FibonaciSeriece 
{
	 static void findFibonaci(int n) {
			int a=0,b=1;
			int c;
			System.out.println(a+" "+b);
			for(int i=1; i<=n; i++)
			{
			 c=a+b ;
			a=b;
			b=c;
			System.out.println(c);
			}
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		findFibonaci(n);
	}

}
