package inter.com;

import java.util.Scanner;

public class factorialNumber
{

	 static int findFact(int n) {
		 int fact=1;
			for(int i=1; i<=n; i++)
			{
				fact=fact*i;
			}
			return fact;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=findFact(n);
		System.out.println(res);
	}
}
