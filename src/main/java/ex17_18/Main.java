package ex17_18;

import java.util.Scanner;

/*
17. Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format. 
Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string. 
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode. 

*/
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter two dates in DD-MM-YYYY format: ");
		Scanner in = new Scanner(System.in);
		String d1 = in.next();
		String d2 = in.next();
		System.out.println("The reformatted older date is " + UserMainCode.findOldDate(d1, d2));
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter two more dates in YYYY-MM-DD format: ");
		String d3 = in.next();
		String d4 = in.next();
		System.out.printf("The difference between the dates is about %d months%n",
				UserMainCode.getMonthDifference(d3, d4));

	}

}
