package com.prowings.basics.equals.method;

public class TestEqualsMethod {
	
	public static void main(String[] args) {
		
//		Student s1=new Student(10,"ram");
//		Student s2=new Student(10,"ram");
//		
//		System.out.println(s1.equals(s2));
//       System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
//		
//		String s = "My name is Gaurav";
//		
//		String[] s1 = s.split(" ");
//		System.out.println(Arrays.deepToString(s1));
//		String[] s2= s.split(" ",4);
//		System.out.println(Arrays.deepToString(s2));
		
		
		
		        String str = "apple,banana,orange,grape";

		        // Example 1: Splitting based on ","
		        String[] fruits = str.split(",");
		        System.out.println("Example 1:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        // Example 2: Splitting based on "," with a limit of 2
		        String[] limitedFruits = str.split(",", 2);
		        System.out.println("\nExample 2:");
		        for (String fruit : limitedFruits) {
		            System.out.println(fruit);
		        }

		        // Example 3: Splitting based on "a" with a limit of 3
		        String[] limitedChars = str.split("a", 3);
		        System.out.println("\nExample 3:");
		        for (String character : limitedChars) {
		            System.out.println(character);
		        }
		    
		

		
	}

}
