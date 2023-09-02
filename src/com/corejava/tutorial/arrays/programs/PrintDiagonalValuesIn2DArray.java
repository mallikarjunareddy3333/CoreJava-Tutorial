package com.corejava.tutorial.arrays.programs;

public class PrintDiagonalValuesIn2DArray {

	public static void main(String[] args) 
	{
		
		int[][] array2d = {{5, 5}, 
						  {6, 6},
						  {7, 7}};
		
		int sum = 0;
//		
//		sum = 0;
//		sum = sum + array2d[0][0];
//		sum = sum + array2d[0][1];
//		sum = sum + array2d[1][0];
//		sum = sum + array2d[1][1];
//		sum = sum + array2d[2][0];
//		sum = sum + array2d[2][1];
		
		for (int i=0; i < array2d.length; i++)
		{
			for (int j=0; j < array2d[i].length; j++)
			{
				sum = sum + array2d[i][j];
				System.out.print(array2d[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Sum=" + sum);
		
	}

}
