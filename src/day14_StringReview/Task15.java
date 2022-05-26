package day14_StringReview;

public class Task15 {

	public static void main(String[] args) {
//		## Task15
//		`
//		Write a program to extract digits from a String:
//		     input: ab123c4d56efg
//		     output:123456
//		`

		String input = "AB123C4D56EFG";
		String extractNum = input.replaceAll("[a-z,A-Z]", "");

		System.out.println(extractNum);

	}

}
