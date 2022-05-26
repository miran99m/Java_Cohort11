package may5th_homeworks_mohammed;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * TASK 1 Write a Java Program to Find the largest value between the 3 numbers
		 * below. n1 = -1.0 n2 = 4.5 n3 = -5.3
		 */
		
		double n1 = 30;
		double n2 = 20;
		double n3 = 9;
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("Max: " + n1);
		}
		else if(n2>n3) {
			System.out.println("Max: " + n2);
		}
		else {
			System.out.println("Max: " + n3);
		}


	}

}
