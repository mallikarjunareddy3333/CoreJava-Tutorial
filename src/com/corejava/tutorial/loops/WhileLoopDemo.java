package com.corejava.tutorial.loops;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
		// 1, 2, 3, 4, 5, ...,10
		
		int times = 5;
		
		int start = 1;
		
		while( start <= times ) //1 <= 5, 2 <=5, 3 <=5, ..  // execute below logic until condition is true
		{
			// code goes here which needs to be repeated
			System.out.println("Hello world!");
			start++; // start = start + 1
		}
		
		int i = 1; // step 1
		
		while(i <= 100) // step2
		{
			if(i % 2 == 0) 
			{
				System.out.println(i);
			}
			
			i++; // step3
		}
		
		// 5
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15
		
		
		int tableFor = 5;
		int x = 1;
		
		while(x <= 10) // 1
		{
			int result = tableFor * x;
			System.out.println(tableFor + " * " + x + " = " + result);
			x++;
		}
		
		System.out.println();
		
	}

}
