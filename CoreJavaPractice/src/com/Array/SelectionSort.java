package com.Array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Storing the data");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Selection sort");
		for(int i=0; i<arr.length; i++)
		{
			int pos=i, min=arr[pos];
			for(int j=i+1; j<arr.length; j++)
				{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
				}
			int itr=arr[pos];
			arr[pos]=arr[i];
			arr[i]=itr;
		}
		for(int a : arr)
		{
		System.out.println(a+" ");
		}
	}

}
