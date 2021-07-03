package ex21;

import java.util.Scanner;

/*
21. Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy. 
Include a class UserMainCode with a static method “convertDateFormat” that accepts a String and returns a String. 
 Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode. 
Sample Input: 

*/
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a date in DD/MM/YYYY format:");
		Scanner in = new Scanner(System.in);
		String date = in.nextLine();
		System.out.println(UserMainCode.convertDateFormat(date));
	}

}
