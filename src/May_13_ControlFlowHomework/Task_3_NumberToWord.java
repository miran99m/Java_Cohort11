package May_13_ControlFlowHomework;

public class Task_3_NumberToWord {

	public static void main(String[] args) {

//		## Task3
//
//		`Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
//					Ex:
//						number = 1;
//					output:
//						One
//		`

		int number = 2;

		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;

		case 8:
			System.out.println("Eight");
			break;

		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Number must be 0-9");

		}

	}

}
