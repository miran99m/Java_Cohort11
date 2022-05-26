package May_13_ControlFlowHomework;

import java.util.Scanner;

public class Task_5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Please Enter your %d number: ", i);
			int input = sc.nextInt();
			if (input > max) {
				max = input;
			}
		}
		System.out.println("Max number: " + max);

		sc.close();
	}

}
