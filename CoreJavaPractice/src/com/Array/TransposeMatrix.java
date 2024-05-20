package com.Array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//	int arr[][]= {{11,22,33},{44,55,66},{77,88,99}};
//	for(int i=0; i<arr.length; i++)
//	{
//		for(int j=0; j<arr[i].length; j++)
//		{
//				System.out.print(arr[i][j]+" ");
//		}
//			System.out.println();
//	}
//	for(int i=0; i<arr.length; i++)
//	{
//		for(int j=0; j<arr[i].length; j++)
//		{
//		System.out.print(arr[j][i]+" ");
//			}
//		
//		System.out.println();
//	}
		int arr[][][]=new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		System.out.println("Store the array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					arr [i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Display the array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("transpose Matrix");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[k][j][i]+" ");
				}
				System.out.println();
			}
		}
	}
}
