package day14_StringReview;

public class Task4 {

	public static void main(String[] args) {
//		write a program that can check if the first and last characters of the string are same
//        ex:
//            level
//        output:
//            same

		String input = "LEVEL";

		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}

	}
}
