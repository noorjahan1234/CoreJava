package com.Array;

import java.util.Scanner;

public class BubbelSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Storing the element");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Displaying Befeor Array");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int itr=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=itr;
				}
			}
		}
		System.out.println("After Sorting Array");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
		if(key==arr[i])
		{
			System.out.println("key found");
			return;
		}
		}
		System.out.println("Not");
	}

}
