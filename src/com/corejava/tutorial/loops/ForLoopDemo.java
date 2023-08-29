package com.corejava.tutorial.loops;

public class ForLoopDemo {

	public static void main(String[] args) 
	{
		
//		for (initialization; condition; increment/decrement)
//		{
//			//body
//		}
		
		// 10, 9, 8, ...., 1
		
		for ( int i=10; i >= 1; i-- )
		{
			System.out.println(i);
		}
		
//		int tableFor = 5;
//		int x = 1;
//		
//		while(x <= 10) // 1
//		{
//			int result = tableFor * x;
//			System.out.println(tableFor + " * " + x + " = " + result);
//			x++;
//		}
//		
		System.out.println();
		
		int tableFor = 5;
		
		for (int x = 1; x <=10; x++ )
		{
			int result = tableFor * x;
			System.out.println(tableFor + " * " + x + " = " + result);
		}
		
	}

}
