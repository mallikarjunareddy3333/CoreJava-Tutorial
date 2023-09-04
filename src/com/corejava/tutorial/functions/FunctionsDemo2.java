package com.corejava.tutorial.functions;

public class FunctionsDemo2 
{

	public static void main(String[] args) 
	{
		sum(10, 20);
		sum(100, 200);
	}
	
	static void sum(int a, int b)
	{
		System.out.println("a=" + a + ", b=" + b + ", Sum=" + (a + b));
	}
}
