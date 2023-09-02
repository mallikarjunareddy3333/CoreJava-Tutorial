package com.corejava.tutorial.arrays.programs;

public class SumOfValuesInArray {

	public static void main(String[] args) 
	{
		
		int[] array1 = {5, 6, 2, 3, 7, 9};
		
		int sum = 1;
//		
//		sum = 0;
//		sum = sum + array1[0];
//		sum = sum + array1[1];
//		sum = sum + array1[2];
//		sum = sum + array1[3];
		
		for (int i=0; i < array1.length; i++)
		{
			sum = sum + array1[i];
			System.out.println(array1[i]);
		}
		
		System.out.println("Sum=" + sum);
		
	}

}
