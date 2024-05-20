package com.Array;

import java.util.Scanner;

public class BinarrySearch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int arr[]=new int[sc.nextInt()];
		System.out.println("storded the data");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display the Array");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		int low = 0,high = arr.length,mid;
				while(low<high)
			{
				mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key is found: "+key+" index "+mid);	
				return;
			}
			else if(key>arr[mid])
			{
				low=(mid+1);
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("Not Found");
	}
	
}
