package day7_2ndReview;

import java.util.Scanner;

public class Solution_F {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character: ");

		String input = sc.nextLine();

		sc.close();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				System.out.printf("'%c' is a uppercase letter", ch);
			else if (ch >= 'a' && ch <= 'z')
				System.out.printf("'%c' is a lowercase letter", ch);
			else if (ch >= '0' && ch <= '9')
				System.out.printf("'%c' is a number", ch);
			else
				System.out.println("this input cannot be computed");

		}

	}

}
