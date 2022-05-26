package day15_may21st;

public class Task4 {

	public static void main(String[] args) {

		String str = "blue";

		if (str.startsWith("red")) {
			System.out.println(str.substring(0, 3));
		} else if (str.startsWith("blue")) {
			System.out.println(str.substring(0, 4));
		} else {
			System.out.println(str.replaceAll(str, ""));
		}

	}

}
