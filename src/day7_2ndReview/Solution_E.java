package day7_2ndReview;

import java.util.Scanner;

public class Solution_E {
	/*
	 * ## Task E - Lucky Number
	 * 
	 * A four-digit number `ABCD` is called lucky if `A` + `B` = `C` + `D`
	 * 
	 * Write a program that asks the user to enter a four-digit number and tell if
	 * the number is a lucky number or not. if it's a lucky number print `Yay,
	 * <number> is a lucky number`, otherwise print `Nah, <number> is not a lucky
	 * number`
	 ** 
	 * Example 1:**
	 * 
	 * ```text Please enter 4 digits number: >3719 Yay, 3719 is a lucky number ```
	 ** 
	 * Example 2:**
	 * 
	 * ```text Please enter 4 digits number: >3521 Nah, 3521 is not a lucky number
	 * ```
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 digits following spaces");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		boolean isLuckyNo = a + b == c + d;

		sc.close();
		if (isLuckyNo) {
			System.out.printf("Yay %d%d%d%d is a lucky number!", a, b, c, d);
		} else {
			System.out.printf("Nah, %d%d%d%d is not a lucky number", a, b, c, d);
		}

	}

}
