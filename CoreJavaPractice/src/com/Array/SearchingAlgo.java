package com.Array;

import java.util.Scanner;

public class SearchingAlgo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Stroring the data");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Displaying the data");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key is Found: " +key+ " index " + i);
				return;
			}
		}
				System.out.println("Not Found");
	}

}
