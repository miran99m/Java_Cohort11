package day14_StringReview;

public class Task7 {

	public static void main(String[] args) {

//		Write a method that asks user to enter a string.
//        if the string is empty, print: string is empty
//        if the string has more than 3 characters, print the last three characters
//        if the string has less than or equal 3 characters, print the string itself

		Task7 ck = new Task7();
		ck.check("TechCircle");
	

	}

	public void check(String a) {

		if (a.isEmpty()) {
			System.out.println("String is empty");
		} else if (a.length() > 3) {
			System.out.println(a.substring(a.length() - 3));
		} else {
			System.out.println(a);
		}

	}

}
