package com.corejava.tutorial.datatypes;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		
		//variables and values
		
		// Arithmetic operators
		
		//10 + 20
		
		// num1 + num2
		// num1 - num2
		// *
		// /
		// %
		
		// num1 + 20
		// 10 + num2
		
		// sum = num1 + num2
		// total = sum + interest
		
		// P T R / 100
		
		int principle = 10000;
		int term = 12;
		double rate = 1.5;

		double interestAmount = ( principle * term * rate ) / 100;
		
		System.out.println(principle + interestAmount);
		
		
		int x = 10;
//		x--; // x = x + 1
//		
//		System.out.println(x);
//		
		
		//Assignment operators
		// to assign a value to a variable
		
		int value = 10;
		int value2 = value;
		
		x = x;
		
		x += 3; // X = x + 3
		
		System.out.println(x);
		
		System.out.println(value + " " + value2);
		
		
		// comparison operators - return boolean
		
		int marks = 65;
		
		System.out.println(marks == 65); //true
		System.out.println(marks == 66); //false
		
		System.out.println(marks != 65); //false
		System.out.println(marks != 66); //true
		
		// Logical operator
		System.out.println((marks == 65) && (marks != 65));// true && false -> false
		System.out.println((marks == 65) || (marks != 65)); //  true || false -> true
		System.out.println(!(marks == 65)); // ! true -> false
		
//		&&
//		true true -> true
//		false true -> false
//		false false -> false
//		true false -> false
		
//		||
//		true true -> true
//		false true -> true
//		false false -> false
//		true false -> true
		
		
		System.out.println(true && true);
	}

}
