package day11_3rdReview;

import java.util.Scanner;

public class Task_2 {
//	## Task - Power of Number
//
//	Two numbers are entered through the keyboard. Write a program to find the value of one number raised
//	to the power of another.
//
//	### Constraint
//
//	- Do not use Java built-in method
//
//	Example:
//
//	```text
//	3 2
//	The result is 9
//	```
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your base no and exponent: ");
		int base = sc.nextInt();
		int exp = sc.nextInt();
		int total = 1;

		for (int i = 1; i <= exp; i++) {
			total *= base; // total = total * base
		}
		System.out.println(total);

		sc.close();

		int num = 101;
		while (num > 1) {
			num--;
			System.out.println(num);
		}
	}

}
