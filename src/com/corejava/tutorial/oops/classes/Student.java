package com.corejava.tutorial.oops.classes;

public class Student 
{
	int id;
	String name;
	int age;
	String mobile;
	String address;
	
	// constructor
	public Student() {
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", address=" + address
				+ "]";
	}
	
	public static void main(String[] args) 
	{
		// created an object for Student class
		Student stud1 = new Student();
		
		stud1.id = 1;
		stud1.name = "Arjun";
		stud1.age = 26;
		
		System.out.println("Student [id=" + stud1.id + 
				", name=" + stud1.name + ", age=" + stud1.age 
				+ ", mobile=" + stud1.mobile 
				+ ", address=" + stud1.address
				+ "]");
		
		Student stud2 = new Student();
		
		stud2.id = 2;
		stud2.name = "Prasad";
		stud2.age = 26;
		
		System.out.println(stud2);
		
		System.out.println(stud2.toString());
		
	}
}
