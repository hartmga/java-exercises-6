package ex21;

public class UserMainCode {

	public static String convertDateFormat(String s) {
		return s.replaceAll("^(?<D>\\d\\d)/(?<M>\\d\\d)/\\d\\d(?<Y>\\d\\d)$", "${D}-${M}-${Y}");
	}

}
