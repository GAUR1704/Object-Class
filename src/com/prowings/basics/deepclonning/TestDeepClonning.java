package com.prowings.basics.deepclonning;


public class TestDeepClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address address1= new Address(145,"pune");
		Student s1= new Student("gaurav",100,address1);
		
		Student s2=(Student) s1.clone();
		s2.address.city="delhi";
		System.out.println("s1 name is :"+s1.name);
		System.out.println("s1 id is :"+s1.id);
		System.out.println("s1 pin is :"+s1.address.pin);
		System.out.println("s1 city is :"+s1.address.city);
		
		System.out.println("=============");
		
		
		System.out.println("s2 name is :"+s2.name);
		System.out.println("s2 id is :"+s2.id);
		System.out.println("s2 pin is :"+s2.address.pin);
		System.out.println("s2 city is :"+s2.address.city);
		
		
	}

}
