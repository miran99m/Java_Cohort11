package day14_StringReview;

 public class Task14 {

	public static void main(String[] args) {

//		## Task14
//Write a program that asks user to enter first and last names, and then prints 
//		the full name in regular format (first character in upper case)
//
//		                    input:
//		                        firstName = "tecHCIrcle"
//		                        lastName = "SCHOOL";
//
//		                    output:
//		                        Techcircle School

		String fName = "MohAMMedd";
		String lName = "MIRAN";

		String modifyFirst = fName.toUpperCase().charAt(0) + fName.toLowerCase().substring(1);
		String modifySecond = lName.toUpperCase().charAt(0) + lName.toLowerCase().substring(1);

		System.out.println(modifyFirst + " " + modifySecond);

	}

}
