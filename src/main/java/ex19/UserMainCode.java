package ex19;

public class UserMainCode {

	public static boolean ipValidator(String ip) {
		return ip.matches(
				"^(?:(?:(?:[0-1]?[\\d]?[\\d])|(?:[2][0-4][\\d])|(?:[2][5][0-5]))\\.){3}(?:(?:(?:[0-1]?[\\d]?[\\d])|(?:[2][0-4][\\d])|(?:[2][5][0-5])))$");
	}

}
