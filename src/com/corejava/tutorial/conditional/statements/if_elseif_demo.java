package com.corejava.tutorial.conditional.statements;

public class if_elseif_demo {

	public static void main(String[] args) 
	{
		// Grade  A - >= 70, B >= 50, C >= 35 <= 50
		
		int marks = 20;
		
		if ( marks >= 70 )
		{
			System.out.println("Student is PASS, Grade: A");
		}
		else if(marks >= 50)
		{
			System.out.println("Student is PASS, Grade: B");
		}
		else if(marks >= 35)
		{
			System.out.println("Student is PASS, Grade: C");
		}
		else
		{
			System.out.println("Sorry!");
			System.out.println("Student is FAIL");
		}
		
	}

}
