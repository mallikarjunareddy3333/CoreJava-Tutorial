package com.corejava.tutorial.strings;

import java.util.Arrays;

public class StringsDemo {

	public static void main(String[] args) 
	{
		String message = "Hello, good morning!";
		
		char letter = 'H';
		
		char[] messageArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'g', 'o'};
		
		System.out.println(message);
//		System.out.println(Arrays.toString(messageArray));
//		printArrayAsString(messageArray);
		printCharactersInString(message);
		System.out.println();
		
		char[] message2 = message.toCharArray();
		printArrayAsString(message2);
	}
	
	static void printArrayAsString(char[] array)
	{
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
	
	static void printCharactersInString(String value)
	{
		int length = value.length();
		
		for (int i=0; i < length; i++)
		{
			char letter = value.charAt(i);
			System.out.print(letter);
		}
	}
	
}