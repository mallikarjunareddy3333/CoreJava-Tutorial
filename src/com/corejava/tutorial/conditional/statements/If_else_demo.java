package com.corejava.tutorial.conditional.statements;

public class If_else_demo {

	public static void main(String[] args) {
		
		int marks = 35;
		int PASS_MARK = 35;
		
		if ( marks >= PASS_MARK )
		{
			System.out.println("Congrats!");
			System.out.println("Student is PASS");
		}
		else
		{
			System.out.println("Sorry!");
			System.out.println("Student is FAIL");
		}
	}

}
