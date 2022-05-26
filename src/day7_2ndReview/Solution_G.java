package day7_2ndReview;

public class Solution_G {

	public static void main(String[] args) {

		int n = 99;

		if (n > -1 && n < 100) {

			if (n % 2 == 1 || ((n % 2 == 0) && n >= 6 && n <= 20)) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
			
		} else {
			System.out.println("Number needs to be between -1 && 100");
		}

	}

}
