package com.corejava.tutorial.arrays.programs;

public class MatrixMultiplication {

	public static void main(String[] args) 
	{
		int[][] array1 = {{2, 3}, 
				  		  {4,5}};  // 2x2  -> m = 2, n = 2
		int[][] array2 = {{2, 3}, 
						  {4,5}}; // 3x2  -> n = 2, p = 2
		
		
		int[][] resultArray = new int[2][2];  // m,p
		
		int m = array1.length;
		int n = array1[0].length;
		int p = array2[0].length;
		
		for(int i=0; i < m; i++)
		{
			for (int j = 0; j < p; j++)
			{
				resultArray[i][j] = 0;
				
				for(int k = 0; k < n; k++)
				{
					System.out.println(resultArray[i][j] + " ");
					
					System.out.println(array1[i][k] + "*" + array2[k][j]);
					
					resultArray[i][j] = resultArray[i][j] + (array1[i][k] * array2[k][j]);
					
					System.out.print(resultArray[i][j]);
				}
				
				System.out.print(resultArray[i][j]);
			}
			
			System.out.println();
		}
		
		for(int i=0; i < m; i++)
		{
			for (int j = 0; j < p; j++)
			{
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
