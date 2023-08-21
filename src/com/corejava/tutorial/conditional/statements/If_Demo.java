package com.corejava.tutorial.conditional.statements;

public class If_Demo {

	public static void main(String[] args) 
	{
		
		int marks = 34;
		int PASS_MARK = 35;
		
		if ( marks >= PASS_MARK )
		{
			System.out.println("Student is PASS");
		}
		
		if(marks < PASS_MARK )
		{
			System.out.println("Student is FAIL");
		}
		
	}

}
