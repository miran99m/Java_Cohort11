package may5th_homeworks_mohammed;

public class Task5 {

	public static void main(String[] args) {
		// Create a program to print out the name of the age group based on the age
		// provided.
		// Input:
		// Age = 2
		// Output:
		// Infancy
		//
		// Input:
		// Age = 3
		// Output:
		// toddler

//				Infant = 1-2 year
//				Toddler = 3-4 yrs		
//				Child = 5-12 yrs		
//				Teen = 13-19 yrs
//				Adult = 20-39 yrs
//				Middle Age Adult = 40-59 yrs
//				Senior Adult = 60+
		int age = 33;
		if (age <= 2 && age >= 1) {
			System.out.println("Infant");
		} else if (age <= 4 && age >= 3) {
			System.out.println("Toddler");
		} else if (age <= 7 && age >= 5) {
			System.out.println("Early School Age");
		} else if (age <= 12 && age >= 8) {
			System.out.println("Middle School Age");
		} else if (age <= 17 && age >= 13) {
			System.out.println("Early Adolescene");
		} else if (age <= 25 && age >= 18) {
			System.out.println("Later Adolescene");
		} else if (age <= 30 && age >= 25) {
			System.out.println("Early Adulthood");
		} else if (age <= 50 && age >= 30) {
			System.out.println("Middle Adulthood");
		} else if (age > 50) {
			System.out.println("Later Adulthood");
		} else {
			System.out.println("Invalid age");
		}

	}

}
