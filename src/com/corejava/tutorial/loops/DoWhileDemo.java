package com.corejava.tutorial.loops;

public class DoWhileDemo {

	public static void main(String[] args) 
	{
		int i = 1; // step 1
		
//		while(i <= 10) // step2
//		{
//			System.out.println(i);
//			
//			i++; // step3
//		}
//		
		
		do
		{
			System.out.println(i);
			i++;
		} while(i < 0);
		
	}

}
