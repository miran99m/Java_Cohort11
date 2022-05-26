package day14_StringReview;

public class Task13 {

	public static void main(String[] args) {
//		## Task13
//		`
//	Create a class called EmailTask2.
// Assume that email address is constructed by person's first name and followed by an underscore and last name.
//
//Write a program that will print out information about user based on email. Print first name, last name, and domain.
//
// First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//		               Ex:
//		                   input:
//		                       techcircle_school@aws.com
//
//		                Output:
//		                    First name: Techcircle
//		                    Last name: School
//		                    Domain: aws

		String email = "TECHCIRCLE_sCHOOL@aws.com";
		String fName = email.substring(0, email.indexOf("_"));
		String lName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
		String domainName = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

		String modifyFirst = fName.toUpperCase().substring(0, 1) + fName.toLowerCase().substring(1);
		String modifySecond = lName.toUpperCase().substring(0, 1) + lName.toLowerCase().substring(1);

		System.out.println();
		System.out.println("First name: " + modifyFirst);
		System.out.println("Last  name: " + modifySecond);
		System.out.println("Domain name: " + domainName.toLowerCase());

	}

}
