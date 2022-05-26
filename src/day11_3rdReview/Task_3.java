package day11_3rdReview;

public class Task_3 {

	public static void main(String[] args) {
//		Let's write program that check the user authorization before using the internal company software.
//		The program should ask the full name of the user and clearance level (1-4).
//
//		Denote the level of the clearance:
//
//		- `1` = junior employee
//		- `2` = senior employee
//		- `3` = manager
//		- `4` = admin

		int cLevel = 1;
		String name = "Mohammed";

		switch (cLevel) {
		case 1:
			System.out.printf("Sorry, %s , the junior employee don't have access to this program", name);
			break;
		case 2:
			System.out.printf("Sorry, %s , the Senior employee don't have access to this program", name);
			break;
		case 3:
			System.out.printf("Sorry, %s , the Senior employee don't have access to this program", name);
			break;
		case 4:
			System.out.printf("%s, you are admin. Welcome to the Program ABC", name);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
