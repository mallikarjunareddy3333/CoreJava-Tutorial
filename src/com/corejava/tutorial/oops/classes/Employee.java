package com.corejava.tutorial.oops.classes;

public class Employee 
{
	int id;
	String name;
	String designation;
	long salary;
	String managerName;
	
	//default constructor
	public Employee()
	{
		
	}
	
	// parameterized constructor
	public Employee(int id, String name, String designation)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", managerName=" + managerName + "]";
	}

}
