package com.Array;

import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr1[]=new int[sc.nextInt()];
		int arr2[]=new int[arr1.length];
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("First");
		for(int a : arr1)
		{
			System.out.println(a+" ");
		}
		System.out.println("Second");
		for(int a : arr2)
		{
			System.out.println(a+" ");
		}
		System.out.println("Add Array");
		int arr[]=new int[arr1.length];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=arr1[i]+arr2[i];
			System.out.println(arr[i]+" ");
		}
	}

}
