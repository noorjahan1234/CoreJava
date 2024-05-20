package com.Array;

import java.util.Scanner;

public class ReverceArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("Enter the stored number");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
//		for(int x : arr1)
//		{
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		System.out.println("Reverce Array");
//		for(int i=arr1.length-1; i>=0; i--)
//		{
//			System.out.print(arr1[i]+" ");
//		}
		int arr2[]=new int[arr1.length];
		int j=arr2.length-1;
		for(int i=0; i<arr2.length; i++)
		{
			arr2[j]=arr1[i];
			j--;
			System.out.print(arr2[i]+" ");
		}
		
	}

}
