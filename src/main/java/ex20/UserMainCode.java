package ex20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UserMainCode {

	// input format: YYYY-MM-DD
	public static int getDateDifference(String d1, String d2) {
		LocalDate date1 = LocalDate.parse(d1);
		LocalDate date2 = LocalDate.parse(d2);
		return (int) ChronoUnit.DAYS.between(date1, date2);
	}

}
