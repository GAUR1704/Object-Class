package com.prowings.basics.equals.method;

public class Student {
	int id;
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString(int id,String name) {
		return "[Id = "+id+" Name = "+name+" ]";
	}

	public boolean equals(Object obj) {
		int id1 = this.id;
		String name1 = this.name;

		Student s = (Student) obj;

		int id2 = s.id;
		String name2 = s.name;
		

		if ((name1.equals(name2)) && id1 == id2) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		int prime=31;
		int result=1;
		
		result=result*prime+id;
		result=result*prime+(name !=null ? name.hashCode():0);
		
		return result;
		
	}

}
