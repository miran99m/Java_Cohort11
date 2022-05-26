package day7_2ndReview;

import java.util.Scanner;

public class Solution_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first String");
		String greet = sc.nextLine();
		System.out.println("Enter First No: ");
		int a = sc.nextInt();
		System.out.println("Enter Second No: ");
		int b = sc.nextInt();
		sc.close();
		
		int sum = a + b;

		System.out.println("My String is " + greet + "\nFirst No: " + a + "\nSecond No: " + b + "\nSUM: " + sum);

	}

}
