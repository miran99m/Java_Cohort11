package may5th_homeworks_mohammed;

public class Task3 {

	public static void main(String[] args) {
		
		
		//TASK 3
		/*Write a Java Program that prints the day of the week. 
 			Note : Your input must be between 1 to 7:
 		Example:
			Input   : 1
         		output :  Monday
*/
		
		int days = 2;
		
		switch(days) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}

}
