package day11_3rdReview;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

//		## Task - warm up
//		- Write program to enter the number and print it in words. (n < 100)
//		Example:
//		```text
//		23
//		twenty three
//
//		7
//		seven
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		while (num > 99 || num < 0) {
			System.out.println("Please enter valid number between 0-100: ");
			num = sc.nextInt();
			break;
		}

		int lastDigit = num % 10; // Last Digit!!
		int removeLastDigit = num / 10; // Last Digits get removed

		String[] singleDigits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		String[] twoDigits = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };
		String[] tens = new String[] { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (num > 0 && num < 10) {
			System.out.println(singleDigits[lastDigit]);

		} else if (num >= 10 && num < 20) {
			System.out.println(twoDigits[lastDigit]);
			
		} else {
			System.out.println(tens[removeLastDigit - 2] + " " + singleDigits[lastDigit]);
			System.out.println();
		}
		sc.close();
	}

}
