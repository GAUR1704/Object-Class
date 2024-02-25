package com.prowings.basics.deepclonning;



	public class Student implements Cloneable {
		
		String name;
		int id;
		Address address;
		
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Student(String name, int id, Address address) {
			super();
			this.name = name;
			this.id = id;
			this.address = address;
		}
		
		
		public Object clone() throws CloneNotSupportedException
		{
			Address address2= new Address(11,"mumbai");
			Student s2= new Student("vaibhav",12,address2);
			
			return s2;
					
		}
	}
		
