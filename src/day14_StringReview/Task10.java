package day14_StringReview;

public class Task10 {

	public static void main(String[] args) {
//		## Task10
//		`
//		ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
//	

		String word = "Lovely";

		boolean endsWithLy = word.endsWith("ly");

		if (endsWithLy) {
			System.out.println("really???");
		} else {
			System.out.println("Never Mind!");
		}

	}

}
