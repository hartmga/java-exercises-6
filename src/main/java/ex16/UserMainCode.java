package ex16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UserMainCode {

	// the use of the map is backwards in this method, but this is what the exercise
	// requested
	public static String[] obtainDesignation(Map<String, String> empToDes, String des) {
		List<String> empNames = new ArrayList<>();
		for (Entry<String, String> e : empToDes.entrySet()) {
			if (e.getValue().equals(des)) {
				empNames.add(e.getKey());
			}
		}
		String[] toReturn = new String[empNames.size()];
		return empNames.toArray(toReturn);
	}

}
