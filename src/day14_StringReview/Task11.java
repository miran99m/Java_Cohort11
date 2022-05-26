package day14_StringReview;

public class Task11 {

	public static void main(String[] args) {
//
//		## Task11
//		`
//		Ask user to enter a word. If the work starts with x, print the word without x.
//		                    Input:
//		                        xcode
//		                    Output:
//		                        code

		String word = "xcode";
		boolean startsWithX = word.startsWith("x");

		if (startsWithX) {
			System.out.println(word.substring(1));
		}

	}

}
