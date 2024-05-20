package inter.com;

import java.util.Scanner;

public class GcdNumber {

	static int findGcd(int n1, int n2)
	{
		int gcd=0;
//		for(int i=1; i<n1&&i<n2; i++)
//		{
//			if(n1%i==0 && n2%i==0)
//			{
//				gcd=i;
//			}
//		}
		while(n1!=n2)	
		{
			if(n1>n2)
			{
			n1=n1-n2;
			}
			else
			{
				n2=n1-n2;
			}
		}
		return n2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int res=findGcd(n1,n2);
		System.out.println("GCD: "+res);
	
	}

}
