package inter.com;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int sum=0;
		int digit = 0;
		//num not equal to zero
		while(num!=0)
		{
			//sum+ and reminder
			sum+=num%10;
			//number divided by 10
			num=num/10;
		}
		System.out.println(sum);
	}
}
