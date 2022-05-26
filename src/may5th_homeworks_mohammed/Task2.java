package may5th_homeworks_mohammed;

public class Task2 {

	public static void main(String[] args) {

		/**
		 * Write a Java Program to print following message.
		 * 
		 * Good Morning 5< 12 Good Afternoon 12 — 17 Good Evening 17—24
		 */

		int hours = 0;
		if (hours <= 23 && hours >= 0) {

			if (hours >= 5 && hours < 12) {
				System.out.println("Good morning");

			} else if (hours >= 12 && hours < 17) {
				System.out.println("Good Afternoon");

			} else if (hours >= 17 && hours <= 23) {
				System.out.println("Good Evening");

			} else {
				System.out.println("Late night!!!");
			}
		} else {
			System.out.println("Invalid time");
		}
	}

}
