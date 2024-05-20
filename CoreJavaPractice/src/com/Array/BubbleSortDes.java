package com.Array;

import java.util.Scanner;

public class BubbleSortDes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Stored Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Displaying the Array element");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		int[] sortedArray= MethodBubbleSort.findMethodBubble(arr);
		System.out.println();
		System.out.println("Dispalying the After");
		for(int a : arr) {
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter the Key Element");		
		int key=sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Fount: "+key+" index "+ i);
				return;
			}
		}
			System.out.println("Key Not Found");
	}
}
