package com.corejava.tutorial.arrays;

public class ArraysDemo 
{

	public static void main(String[] args) 
	{
		
		// int -> 4 bytes
		// int[5] -> 5 * 4 -> 20 bytes
		
		//int employeeIds2[] = {1, 2, 3, 4, 5};

//		int[] employeeIds = new int[5];
//		
//		employeeIds[0] = 100;
//		employeeIds[3] = 104;
//		employeeIds[1] = 102;
		
		// Declaring & initialization
		int[] employeeIds = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Size of the Array: " + employeeIds.length);
		
		// print/access the values of an array
//		System.out.println(employeeIds[0]); // 1
//		System.out.println(employeeIds[1]); // 2
//		System.out.println(employeeIds[2]); // 3
//		System.out.println(employeeIds[3]); // 4
//		System.out.println(employeeIds[4]); // 5
		
		
//		for(int i = 0; i < employeeIds.length; i++)
//		{
//			System.out.println(employeeIds[i]); // 3
//		}
		
		int index = 0;
		
		while( index < employeeIds.length )
		{
			System.out.println(employeeIds[index]);
			
			index++;
		}
		
	}

}
