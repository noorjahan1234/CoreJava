package com.Array;

public class MethodBubbleSort 
{
	public static int[] findMethodBubble(int[] arr) {
		for(int i=0; i<arr.length; i++)
	{
		for(int j=0; j<arr.length; j++)
		{
			if(arr[i]>arr[j]) {
				int itr=arr[i];
				arr[i]=arr[j];
				arr[j]=itr;
			}
		}
	}
		return arr;
}
}