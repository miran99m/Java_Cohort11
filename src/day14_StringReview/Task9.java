package day14_StringReview;

public class Task9 {

	public static void main(String[] args) {

//		## Task9
//		`
//		Ask user to enter two words. Print first word without its first character
//		        then print the second word without its first character.
//		                Input:
//		                    apple
//		                    banana
//		                Output:
//		                    ppleanana
//		`
		
		
		String fWord = "apple";
		String sWord = "banana";
		
		System.out.println(fWord.substring(1) +sWord.substring(1) );
		
	}

}
