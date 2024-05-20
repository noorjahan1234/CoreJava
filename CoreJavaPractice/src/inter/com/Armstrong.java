package inter.com;

import java.util.Scanner;

public class Armstrong 
{

	private static boolean findAramstrong(int n) 
	{
		int num=n;
		int res,rem; 
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			res=(rem*rem*rem);
			sum=sum+res;
			n=n/10;
		}
		n=num;
		if(sum==n)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean re=findAramstrong(n);
	System.out.println(re);
			
//	int rem,res;
//	int sum=0;
//	int num=n;
//	while(n!=0)
//	{
//		rem=n%10;
//		res=(rem*rem*rem);
//		sum=sum+res;
//		n=n/10;
//	}
//	n=num;
//	if(n==sum)
//	{
//		System.out.println("yes: "+sum);
//	}
//	else
//	{
//		System.out.println("No: "+sum);
//	}
	}
}
