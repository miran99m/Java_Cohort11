package day14_StringReview;

public class Task12 {

	public static void main(String[] args) {

//		## Task12
//		`
//Create a class calledEmailTask1.
//Assume that email address is constructed by person's first name and followed by an underscore and last name.
//
//	 Write a program that can swap first name with last name in the email (Seperated by an underscore).
//   If the email doesn't contain an underscore print the given input email.
//
//		            Ex:
//		                input: mike_tyson@gmail.com
//		                output: tyson_mike@gmail.com

		String email = "miket_yson@gmail.com";

		int underScore = email.indexOf('_');
		if (underScore == -1) {
			System.out.println(email);
		} else {
			String fName = email.substring(0, email.indexOf("_"));
			String lName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
			String remainEmail = email.substring(email.indexOf("@"));
			String newEmail = lName + "_" + fName + remainEmail;

			System.out.println(newEmail);

		}

	}

}
