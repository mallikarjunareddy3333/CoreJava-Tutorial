package com.corejava.tutorial.functions;

import java.util.Arrays;

public class FunctionsDemo 
{

	public static void main(String[] args) 
	{
//		print elements in an array/matrix
//
//		we have two arrays / matrix
//
//			-> LOGIC TO PRINT Array 1
//			-> LOGIC to print Array 2
		
		int[][] array2d = {{5, 5, 5}, 
				  {6, 6, 6},
				  {7, 7, 7}};
		
		int[][] array2dNew = {{5, 5, 5}, 
				  {6, 6, 6},
				  {7, 7, 7}};
		
		printArray(array2d);
		
		printArray(array2dNew);
		
		printArray(array2dNew);
		
		printArray(array2dNew);
		
		printArray(array2dNew);
		
		int[] nums = {20, 3, 2, 1};
		int[] nums1 = {20, 3, 2, 1};
		
		Arrays.sort(nums);
		Arrays.sort(nums1);
		
	}	
	
	static void printArray( int[][] array2d )
	{
		int i=0;
		System.out.println("Array 1 Values: ");
		for (; i < array2d.length; )
		{
			for (int j=0; j < array2d[i].length; j++)
			{
				System.out.print(array2d[i][j] + " ");
			}
			System.out.print("\n");
			i++;
		}
		
		System.out.println(i);
	}
	
	
//	access_specifier returnType methodName(parameter1, param2, ...)
//	{
//		// logic
//		// return value
//		
//	}

}
