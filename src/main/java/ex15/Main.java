package ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter two lists of five integers on two separate lines:");
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			a1.add(in.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			a2.add(in.nextInt());
		}
		ArrayList<Integer> result = UserMainCode.sortMergedArrayList(a1, a2);
		System.out.println(result);

	}

}
