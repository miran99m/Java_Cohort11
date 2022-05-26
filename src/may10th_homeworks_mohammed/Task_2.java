package may10th_homeworks_mohammed;

public class Task_2 {

	public static void main(String[] args) {

		/*
		 * Write a program to calculate the sum of all the number between 1 to 100.
		 * 
		 * output = 5050;
		 */
//		int sum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			sum += i; // sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println(sum); // printing sum

		int x = 1;
		int y = 100;
		int sum = 0;

		while (x <= y) {
			x++;
			sum+=x;
		}
		System.out.println(sum);
	}

}
