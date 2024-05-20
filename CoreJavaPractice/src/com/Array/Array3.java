package com.Array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
//		int arr[][][]= {{{11,22,33},
//			{44,55,66},
//			{77,88,99}}};
//		for(int i=0; i<arr.length; i++) 
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				for(int k=0; k<arr[i][j].length; k++)
//				{
//					System.out.print(arr[i][j][k]+" ");
//				}
//			}
//		}
//		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		int arr[][]=new int[sc.nextInt()][];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=new int[sc.nextInt()];
		}
		System.out.println("Stored in array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before Matrix");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		System.out.println("After Matrix");
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				System.out.print(arr[j][i]+" ");
//			}
//		}	
//		System.out.println();
	}
}
