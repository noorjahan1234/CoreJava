package com.Array;


public class MaxMin {

	public static void main(String[] args) {
		int arr[]= {30,20,10,50};
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
//		int max=arr[0];
//		for(int x: arr)
//		{
//			if(max<x)
//			{
//				max=x;
//			}
//		}
//		System.out.println("Maximum Number:"+max);
//	}
//
		int min=arr[0];
		for(int x: arr)
		{
			if(min>x)
			{
				min=x;
			}
		}
		System.out.println("Minimum Number:"+min);
	}


}
