package day7_2ndReview;

import java.util.Scanner;

public class Solution_A {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		c = sc.nextInt();

		System.out.println(a + " " + b + " " + c);

		if (a > b && a > c && b > c) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();

	}

}
