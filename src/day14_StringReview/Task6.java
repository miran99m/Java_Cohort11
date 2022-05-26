package day14_StringReview;

public class Task6 {

	public static void main(String[] args) {
//		## Task6
//		`
//		write a program that can return the initials of the user
//
//		            ex:
//		                techcircle
//		                school
//
//		            output:
//		                T.S
//
//		        Note: Pay attention to the example output
		
		String str1 = "techcircle";
		String str2 = "school";
		
		System.out.println(str1.toUpperCase().charAt(0) + "." + str2.toUpperCase().charAt(0));
		
	}

}
