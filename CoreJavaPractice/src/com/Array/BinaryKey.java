package com.Array;

import java.util.Scanner;

public class BinaryKey {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Displaying the Array");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		int low=0, high=arr.length ,mid;
		while(high<low)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key Found: "+key+ " index "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("Key Not Found");
	}

}
