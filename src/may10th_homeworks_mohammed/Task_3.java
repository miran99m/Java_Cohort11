package may10th_homeworks_mohammed;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {

		/*
		 * Write a program that ask the user to input a positive integer. It should then
		 * print the multiplication table of that number
		 * 
		 * input = 10; output:
		 * 
		 * 1 X 1 = 1
		 * 
		 * 1 X 2 = 2 1 X 10= 10
		 */

		int input = 1;

		for (int i = 1; i < 10; i++) {

			System.out.println(input + " * " + i + " = " + input * input);

		}
	}

}
