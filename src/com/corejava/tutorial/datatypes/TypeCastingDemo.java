package com.corejava.tutorial.datatypes;

public class TypeCastingDemo {

	public static void main(String[] args) 
	{
		int num = 100;
		
		long numLong = num;
		
		int num2 = (int) numLong;
		
		char letter = '@';
		
		int letterNum = letter;
		
		System.out.println(letterNum);
	}

}
