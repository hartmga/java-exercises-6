package ex20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter two dates in YYYY-MM-DD format: ");
		Scanner in = new Scanner(System.in);
		String d1 = in.next();
		String d2 = in.next();

		System.out.printf("Difference in days is %d.%n", UserMainCode.getDateDifference(d1, d2));
	}

}
