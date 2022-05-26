package day15_may21st;

public class Task6 {

	public static void main(String[] args) {

		String a = "abc";
		String b = "xyz";
		int length = a.length() + b.length();
		String c = "";

		for (int i = 0; i < length; i++) {
			if (i < a.length())
				c += a.substring(i, i + 1);
			if (i < b.length())
				c += b.substring(i, i + 1);
		}
		System.out.println(c);
	}

}
