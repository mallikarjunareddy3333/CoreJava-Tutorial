package com.corejava.tutorial.oops.classes;

public class ClassObjectDemo {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.id = 1;
		emp1.name = "Arjun";
		emp1.designation = "Senior Developer";
		
		System.out.println(emp1.toString());
		
		emp1.id = 2;
		emp1.name = "Manoj";
		emp1.designation = "Junior Developer";
		
		System.out.println(emp1.toString());
		
		Employee emp3 = new Employee(3, "Deva", "Java developer");
		System.out.println(emp3.toString());
		
		Employee emp4 = new Employee(4, "Ramesh", "Quality Analyst");
		System.out.println(emp4.toString());
	}

}
