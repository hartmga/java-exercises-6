package ex16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
16.	A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to
build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists
of the following steps: 
•	Read Employee details from the User. The details would include name and designaton in the given order.
		The datatype for name and designation is string. 
•	Build a hashmap which contains the name as key and designation as value. 
•	You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string
		array of employee names who belong to that designation as output. Include this function in class UserMainCode. 
•	Create a Class Main which would be used to read employee details in step 1 and build the hashmap.
		Call the static method present in UserMainCode. 

*/
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a 'done' after an employee to finish.");
		Scanner in = new Scanner(System.in);
		Map<String, String> namesToDesignations = new HashMap<>();
		String input = "";
		do {
			System.out.print("Enter name: ");
			String name = in.nextLine();
			if ("done".equals(name)) {
				break;
			}
			System.out.print("Enter designation: ");
			String designation = in.nextLine();
			namesToDesignations.put(name, designation);
			System.out.println("-------------------------------------------------------");
		} while (!"done".equals(input));
		System.out.println("Enter a designation:");
		String designation = in.nextLine();
		String[] matchingEmployees = UserMainCode.obtainDesignation(namesToDesignations, designation);
		System.out.printf("You entered these employees with designation '%s':%n", designation);
		for (String name : matchingEmployees) {
			System.out.println("\t" + name);
		}

	}

}
