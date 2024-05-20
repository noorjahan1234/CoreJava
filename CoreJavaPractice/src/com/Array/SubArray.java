package com.Array;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];//5
		System.out.println("Storing the data"); //[1,-2,4,-5,1]
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		//Using count veriable
		int count=0;
		int sum=0;
		//for loop is find index 0-n
		for(int i=0; i<n; i++)
		{
			// j loop start i loop working start i loop
			for(int j=i; j<n; j++)
			{
				//
				sum +=a[j];
				//then sum<0
				if(sum<0)
				{
					//increment count
					count++;
				}
			}
			//stored sum =0
			sum=0;
		}
		System.out.println(count);//9
	}
}
