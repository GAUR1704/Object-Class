package com.prowings.basics.clonning;

public class Student implements Cloneable {
	
	String name;
	String address;
	int id;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}	
	
	
	

	
	


