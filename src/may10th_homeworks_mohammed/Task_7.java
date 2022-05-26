package may10th_homeworks_mohammed;

public class Task_7 {

	public static void main(String[] args) {
//
//		 1. write a program that can find the number of days in a month
//		 Note: MUST USE NESTED IF
//		 */

//		int numOfDays = 0;
//		int month = 4;
//
//		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//			numOfDays = 31;
//		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
//			numOfDays = 30;
//		} else if (month == 2) {
//			numOfDays = 28;
//		} else {
//			System.out.println("Invalid Input");
//		}
//
//		System.out.printf("The number of days in this month is %d", numOfDays);
		
		int month = 1;
		int days = 0;
		
		switch(month) {
		case 1: 
			
		case 3:
		
		case 5:
		
		case 7:
		
		case 8:
			
		case 10:
		
		case 12:
			days = 31;
			System.out.printf("The number of days in this month is %d", days);
			break;
		case 4:
		
		case 6:
		
		case 9:
		
		case 11:
			days = 30;
			System.out.printf("The number of days in this month is %d", days);
			break;
		case 2:
			days = 28;
			System.out.printf("The number of days in this month is %d", days);
			break;
		
		default:
			System.out.println("Invalid Input");
		}
		

	}

}
