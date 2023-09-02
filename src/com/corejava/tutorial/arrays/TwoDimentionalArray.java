package com.corejava.tutorial.arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		char[][] ticTacToeArray = new char[3][3]; // declaration
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
		
		System.out.println(ticTacToeArray[2][2]);
		
		char[][] ticTacToeArray2 = {{'O', 'X', 'X'}, {'O', 'X', 'X'}, {'O', 'X', 'X'}}; // declaration
		
		System.out.println(ticTacToeArray2[2][2]);
		
		//System.out.println(ticTacToeArray2[2][3]); -> Array Index out of bound exception
		
	}

}
