package com.corejava.tutorial.arrays.programs;

public class MartrixAddition {

	public static void main(String[] args) 
	{
		
		int[][] array1 = {{2, 3}, 
						  {4,5}};
		int[][] array2 = {{2, 3}, 
						  {4,5},
						  {4,5}};
		
		int[][] resultArray = new int[2][2];
		
		
		// proper validations
		// both matrix size 
		
		
		for(int i=0; i < array1.length; i++ )
		{
			for (int j=0; j < array1[i].length; j++)
			{
				int sum = array1[i][j] + array2[i][j];
				resultArray[i][j] = sum;
			}
		}
		
		for(int i=0; i < resultArray.length; i++ )
		{
			for (int j=0; j < resultArray[i].length; j++)
			{
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.print("\n");
		}
		
	}

}
