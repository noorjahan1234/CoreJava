package com.Array;

import java.util.Scanner;

public class CopiedArray {

	
//		int arr1[]= {10,20,30,40,50};
//		System.out.println("Print Without Copied");
//		for(int x : arr1)
//		{
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		System.out.println("Copied Array");
//		int arr2[]=arr1;
//		for(int a : arr2)
//		{
//			System.out.print(a+" ");
//		}
	
		static int[] findCopy(int[] arr1) 
		{
//			for(int x : arr1)
//			{
//				System.out.println(x+" ");
//			}
			int arr2[]=new int[arr1.length];
			for(int i=0; i<arr2.length; i++)
			{
				if(arr1==arr2)
				arr2=arr1;
			}
			return arr2;
		
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("Stored array");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] res=findCopy(arr1);
		System.out.println("Copied Array:"+res);
		
		
	}
}
