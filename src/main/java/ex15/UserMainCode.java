package ex15;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {

	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		if (a1.size() + a2.size() < 9) {
			System.out.println("There must be at least 9 elements in the merged list");
			return null;
		}
		ArrayList<Integer> merged = new ArrayList<>(a1);
		merged.addAll(a2);
		Collections.sort(merged);
		ArrayList<Integer> toReturn = new ArrayList<>();
		toReturn.add(merged.get(2));
		toReturn.add(merged.get(6));
		toReturn.add(merged.get(8));
		return toReturn;
	}

}
