package com.Array;

import java.util.Scanner;

public class Sum {

	 static double findSum(int[] arr, int size) 
	{
		int sum=0;
		double avg=0;
//		for(int a: arr)
//		{
//			sum+=a;
//		}
//		return sum;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			avg=sum/size;
		}
		return avg;		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("storing the data");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		double res=findSum(arr,size);
//		System.out.println("Sum: "+res);
		System.out.println("Avreage: "+res);
	}

}
