package com.prowings.basics.clonning;

public class TestClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1= new Student("gaurav","pune",10);
		
		Student s2=(Student) s1.clone();
		
		
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(s2.id);
	}

}
