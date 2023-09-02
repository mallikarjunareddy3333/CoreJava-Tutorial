package com.corejava.tutorial.arrays.programs;

public class SumOfValuesIn2DArray {

	public static void main(String[] args) 
	{
		
		int[][] array2d = {{5, 5, 5}, 
						  {6, 6, 6},
						  {7, 7, 7}};
		
		System.out.println("Array Values: ");
		for (int i=0; i < array2d.length; i++)
		{
			for (int j=0; j < array2d[i].length; j++)
			{
				System.out.print(array2d[i][j] + " ");
			}
			System.out.print("\n");
		}
	
		System.out.println("\nPrint Diagonal Values: ");
		
//		row, column
//		0,0
//		1,1
		
		for (int i=0; i < array2d.length; i++)
		{
			for (int j=0; j < array2d[i].length; j++)
			{
				if(i == j)
				{
					System.out.print(array2d[i][j] + " ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
	}

}
