package day14_StringReview;

public class StringTask1 {

	public static void main(String[] args) {

//		
//		## Task1
//		`write a program that asks user to enter a sentence.
//		                then print the first & last characters of the sentence
//		Example:
//		    Input: Welcome To TechCircle
//		    output: We
		
		
		String input = "Welcome To TechCircle";
		
		System.out.println(input.charAt(0));
		
		System.out.println(input.charAt(input.length()-1));
	}

}
