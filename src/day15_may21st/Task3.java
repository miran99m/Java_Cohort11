package day15_may21st;

public class Task3 {

	public static void main(String[] args) {
//		## Task - Has Bad?
//
//	Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "
//	badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
//		
		String str = "xxbadxx";

		if (str.substring(0, 3).contains("bad")) {
			System.out.println(true);
		}

		if (str.length() > 3 && str.substring(1, 4).equals("bad")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
