package com.Array;

public class Replace 
{
	static void findelace(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
//			if(arr[i]%2==0)
//			{
//				arr[i]=-1;
//			}
			if(arr[i]%3==0)
			{
				arr[i]=0;
			}
//			else
//			{
//				System.out.println("No");
//			}
		}
		for(int a: arr)
		{
			System.out.println(a);
		}
	}
}
