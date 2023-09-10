package com.corejava.tutorial.strings;

public class StringMethodsDemo {

	public static void main(String[] args) 
	{
		String message = "Hello, How are you!";
		
		System.out.println("count of words: " + message.split(" ").length);
		
//		System.out.println(message);
//		
//		System.out.println("size: " + message.length());
//		
//		System.out.println(message.toUpperCase());
//		System.out.println(message.toLowerCase());
//		
//		boolean result = message.startsWith("h") || message.startsWith("H");
//		
//		System.out.println(result);
//		
//		// count 'H'
//		
//		int count = 0;
//		
//		for (int i=0; i < message.length(); i++)
//		{
//			if (message.charAt(i) == 'H') 
//			{
//				count++;
//			}
//			
//			System.out.println(message.charAt(i));
//		}
//		
//		System.out.println("count of 'h' = " + count);
		
		
		String fullName = "Sachin Tendulkar Surname";
		
		String firstName = "";
		String middleName = "";
		String surname = "";
		
		System.out.println("Before processing: ");
		System.out.println("Full Name: " + fullName);
		
		System.out.println("firstName: " + firstName);
		System.out.println("middleName: " + middleName);
		System.out.println("surname: " + surname);
		
		String[] names = fullName.split(" ");
		firstName = names[0];
		middleName = names[1];
		surname = names[2];
	
		System.out.println("\nAfter processing: ");
		System.out.println("Full Name: " + fullName);
		
		System.out.println("firstName: " + firstName);
		System.out.println("middleName: " + middleName);
		System.out.println("surname: " + surname);
		
		// substring
		String message2 = "javac helloworld.java";
		
		String command = message2.substring(0, 5);
		String fileName = message2.substring(6);
		System.out.println(command);
		System.out.println(fileName);
		
		System.out.println(message2.indexOf('.'));
	}

}
