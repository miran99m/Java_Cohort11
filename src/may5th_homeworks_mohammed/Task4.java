package may5th_homeworks_mohammed;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * You can create 2 integer and one operator as a string.
		 * 
		 * It should do some calculation based on the operator that you are providing
		 * and returns a total.
		 * 
		 */

		double a = 9; // Integer 1
		double b = 3; // Integer 2

		String operator = "*"; // One Operator String

		switch (operator) {
		case "+":
			System.out.println(addition(a, b));
			break;
		case "-":
			System.out.println(subtraction(a, b));
			break;
		case "*":
			System.out.println(multiply(a, b));
			break;

		case "/":
			System.out.println(divide(a, b));
			break;
		default:
			System.out.println("Invalid operator");
		}

	}

	public static double addition(double a, double b) {
		return a + b;
	}

	public static double subtraction(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

}
