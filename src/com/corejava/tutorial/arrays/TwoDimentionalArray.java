package com.corejava.tutorial.arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		char[][] ticTacToeArray = new char[4][3]; // declaration
		
		//  	0 1 2
		//
		//  0 	O X X
		//  1 	X O O
		//  2 	X O O
		
		// Memory: 2 bytes * 9 -> 18 bytes
		// ROW x Column
		
		ticTacToeArray[0][0] = 'O';
		ticTacToeArray[0][1] = 'X';
		ticTacToeArray[0][2] = 'X';
		
		ticTacToeArray[1][0] = 'X';
		ticTacToeArray[1][1] = 'O';
		ticTacToeArray[1][2] = 'O';
		
		ticTacToeArray[2][0] = 'X';
		ticTacToeArray[2][1] = 'O';
		ticTacToeArray[2][2] = 'O';
		
		//System.out.println(ticTacToeArray[2][2]);
		
//		char[][] ticTacToeArray2 = {{'O', 'X', 'X'}, {'O', 'X', 'X'}, {'O', 'X', 'X'}}; // declaration
//		
//		System.out.println(ticTacToeArray2[2][2]);
//		
		//System.out.println(ticTacToeArray2[2][3]); -> Array Index out of bound exception
		
		
		// Print the values of an 2-D array
		
//		char row1[] = ticTacToeArray[0];
//		
//		for (int i = 0; i < ticTacToeArray.length; i++)
//		{
//			System.out.print(row1[i] + " ");
//		}
//		
//		System.out.println();
//		
//		char row2[] = ticTacToeArray[1];
//		
//		for (int i = 0; i < ticTacToeArray.length; i++)
//		{
//			System.out.print(row2[i] + " ");
//		}
//		
//		System.out.println();
//		
//		char row3[] = ticTacToeArray[2];
//		
//		for (int i = 0; i < ticTacToeArray.length; i++)
//		{
//			System.out.print(row3[i] + " ");
//		}
		
		
//		for (int row=0; row <3; row++)
//		{
//			char row2[] = ticTacToeArray[row];
//			
//			for (int i = 0; i < ticTacToeArray.length; i++)
//			{
//				System.out.print(row2[i] + " ");
//			}
//			
//			System.out.println();
//		}
		
		
		for (int row=0; row < 3; row++) 
		{
			for (int column = 0; column < ticTacToeArray[row].length; column++)
			{
				System.out.print(ticTacToeArray[row][column] + " ");
			}
			
			System.out.println();
		}
		
		// row=0 -> 0 < 3 
			// column = 0, 0 < 3
				// print [0][0]  -> increment column
			// column = 1, 1 < 3
				// print [0][1]  -> increment column
			// column = 2, 2 < 3
				// print [0][2]  -> increment column
			// column = 3, 3 < 3 (false)
		
			// new line -> increment row
		
		// row=1 -> 1 < 3
			// column = 0, 0 < 3
				// print [1][0]  -> increment column
			// column = 1, 1 < 3
				// print [1][1]  -> increment column
			// column = 2, 2 < 3
				// print [1][2]  -> increment column
			// column = 3, 3 < 3 (false)
		
		// row=1 -> 1 < 3
			// column = 0, 0 < 3
				// print [1][0]  -> increment column
			// column = 1, 1 < 3
				// print [1][1]  -> increment column
			// column = 2, 2 < 3
				// print [1][2]  -> increment column
			// column = 3, 3 < 3 (false)	
		
		
		// 2-D Array -> Matrix
		
		// Matrix Addition, Multiplication, diagonal values, print only last column values
		
	}

}
