package com.corejava.tutorial.conditional.statements;

public class Switch_Demo {

	public static void main(String[] args) 
	{
		
		//Engineering -> department -> CSE, IT, ECE, EEE
		
		String department = "CSE";
		
		switch( department )
		{
			case "CSE":
				System.out.println("The department is CSE");
				System.out.println("The Department code: " + 1001);
				break;
				
			case "ECE":
				System.out.println("The department is ECE");
				System.out.println("The Department code: " + 1002);
				break;
				
			case "EEE":
				System.out.println("The department is EEE");
				System.out.println("The Department code: " + 1003);
				break;
				
			case "IT":
				System.out.println("The department is IT");
				System.out.println("The Department code: " + 1004);
				break;
				
			default:
				System.out.println("The department is UNKNOWN");
				System.out.println("The Department code: UNKNOWN");
				break;
		}
		
		
		//input: character
		//output: tell whether it is ovel or not  (a, e, i, o, u)
		
		
		
	}

}
