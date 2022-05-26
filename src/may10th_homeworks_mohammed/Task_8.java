package may10th_homeworks_mohammed;

public class Task_8 {

	public static void main(String[] args) {

		/*
		 * ValidTriangle A triangle is valid if the sum of all the three angles is equal
		 * to 180 degrees. Write a program that declares three integers as angles and
		 * check whether a triangle is valid or not.
		 */

		final int VALID_ANGLE = 180;
		int angleA = 140, angleB = 20, angleC = 30;
		int sum = angleA + angleB + angleC;

		if (sum == VALID_ANGLE) {
			System.out.println(sum + " Valid Angle!");
		} else {
			System.out.println(sum + " is Not Valid Angle");
		}
		
	

	}

}
