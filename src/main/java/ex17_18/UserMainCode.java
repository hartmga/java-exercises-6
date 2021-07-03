package ex17_18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class UserMainCode {

	// input format: DD-MM-YYYY
	public static String findOldDate(String d1, String d2) {
		LocalDate date1 = LocalDate.parse(d1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate date2 = LocalDate.parse(d2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate older = date1.compareTo(date2) < 0 ? date1 : date2;
		return older.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}

	// input format: YYYY-MM-DD
	public static int getMonthDifference(String d1, String d2) {
		Integer[] d1Nums = Arrays.stream(d1.trim().split("-")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
		Integer[] d2Nums = Arrays.stream(d2.trim().split("-")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
		// the number of days in a month varies, so a difference of 16 days between the
		// day of month is used as an inconsistent cutoff to approximate whether
		// to round the number of months up or down.
		int diff = (d2Nums[0] - d1Nums[0]) * 12 + (d2Nums[1] - d1Nums[1]) + (d2Nums[2] - d1Nums[2]) / 16;
		return diff;
	}

}
