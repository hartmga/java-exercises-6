package ex19;

import java.util.Scanner;

/*
 
19.Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”. 
  
Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1
if it is a valid IP address else return 2. 
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode. 
*/
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter an ip address");
		Scanner in = new Scanner(System.in);
		String ip = in.nextLine();
		System.out.println(UserMainCode.ipValidator(ip) ? "Valid" : "Invalid");
	}

}
