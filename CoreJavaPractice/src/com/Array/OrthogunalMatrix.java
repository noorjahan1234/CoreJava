package com.Array;

import java.util.Scanner;

public class OrthogunalMatrix
{

	static void findOrtho(int[][] arr) 
	{
		for(int i=0; i<arr.length; i++) 
	{
		for(int j=0; j<arr[i].length; j++)
		{
			if(arr!=null)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Storing the data");
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		findOrtho(arr);
		
	}

	 

}
