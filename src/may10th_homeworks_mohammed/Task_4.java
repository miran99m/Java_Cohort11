package may10th_homeworks_mohammed;

public class Task_4 {

	public static void main(String[] args) {
		/*
		 * Write a java program to print sum of even number between 1 to 100.
		 */

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("The sum of even number between 1 & 100 is %d", sum);

	}

}
