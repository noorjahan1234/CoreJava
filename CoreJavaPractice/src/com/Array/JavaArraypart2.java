package com.Array;

import java.util.*;

public class JavaArraypart2 {

	public static void main(String[] args) {
		List<List<Integer>> listOf=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");//5,1,4,0,3,5
		int n=sc.nextInt();
		for(int i=0; i<n; i++)          //[41,77,74,22,44]|[12]|[37,34,36,52]|[20,22,33]
		{
			int d=sc.nextInt();
			List<Integer> list=new ArrayList<>();
			for(int j=0; j<d; d++)
			{
				list.add(sc.nextInt());
			}
			listOf.add(list);
		}
			int q=sc.nextInt();
		for(int i=0; i<q; i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			try {
				System.out.println(listOf.get(x-1).get(y-1)); //[74,52,37]
			}
			catch(Exception e)
			{
				System.out.println("error!");  //[ERROR!,ERROR!]
			}
		}           //[74,52,37,ERROR!,ERROR!]
	}
}
