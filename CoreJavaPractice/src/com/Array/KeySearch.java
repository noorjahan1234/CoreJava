package com.Array;

import java.util.Scanner;

public class KeySearch {

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
		for(int i=0; i<arr.length; i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Found: "+key+ " index "+i);
				return;
			}
		}
		System.out.println("Key Not Found");
	}

}
