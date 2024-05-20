package com.Array;

import java.util.Scanner;

public class ReplaceArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("storing the data in array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		Replace re=new Replace();
		re.findelace(arr);
	}
}
