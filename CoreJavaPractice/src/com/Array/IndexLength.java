package com.Array;

import java.util.Scanner;

public class IndexLength 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Size");
		int arr[]= {11,22,33,44,55};
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(arr.length);
		System.out.println(arr[2]);
	}
}
