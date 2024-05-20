package com.Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
//		int[] arr=new int[4];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		
		/*
		 * int arr[]= {11,22,33,44}; for(int a : arr) { System.out.println(a); }
		 * System.out.println(arr[2]);
		 */	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[]=new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			//System.out.println("Storing the data: "+arr[i]);
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
