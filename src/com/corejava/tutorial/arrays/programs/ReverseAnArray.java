package com.corejava.tutorial.arrays.programs;

public class ReverseAnArray {

	public static void main(String[] args) 
	{
		
		String[] words = {"Hello", "world", "welcome", "to", "java", "tutorial"};
		
		System.out.println("Print all elements");
		for(int i=0; i < words.length; i++)
		{
			System.out.print(words[i] + " ");
		}
		
		System.out.println("\n\nPrint alternate elements");
		
		for(int i=0; i < words.length; i=i+2)
		{
			System.out.print(words[i] + " ");
		}
		
//		start = words.length-1
//	
//		start >= 0
//		
//		start--; start = start - 1
		
		System.out.println("\n\nPrint elements in reverse order");
		
		for (int start=words.length-1; start >= 0; start--)
		{
			System.out.print(words[start] + " ");
		}
		
	}

}
