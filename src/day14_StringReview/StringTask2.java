package day14_StringReview;

public class StringTask2 {

	public static void main(String[] args) {
//		Create a class called Reverse, write a program that will reverse a string.
//	    Your program should reverse a string only 5 characters long.
//	    If word is shorter, display message: "Too short!".
//	    If word is longer, display message: "Too long!".
//	    Otherwise, reverse this word and print out result into the console.
		
		String input  = "pizza";
		
		if(input.length() == 5) {
			for(int i =input.length()-1; i>=0; i--){
				System.out.print(input.charAt(i));
			}
		}
		else if (input.length()-1 > 5) {
			System.out.println("Too Long");
		}else {
			System.out.println("Too Short");
		}
	}

}
