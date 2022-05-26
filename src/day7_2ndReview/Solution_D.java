package day7_2ndReview;

import java.util.Scanner;

public class Solution_D {

	public static void main(String[] args) {
		/*
		 * ## Task - D
		 * 
		 * Write a program that calculates the fine for a speeding ticket. Prompt the
		 * user for several items of information. These data items will be used to
		 * determine the fine.
		 ** 
		 * Here is what your program must do:**
		 * 
		 * Prompt for: driver lastName, firstName, age, speedLimit, actual speed, and
		 * whether you are in a construction zone.
		 * 
		 * Calculate the components of the fine and the total fine (see rules below).
		 ** 
		 * Rules to calculate fine:**
		 * 
		 * 1. if driver is less than 5mph over limit, no fine is assessed, but you
		 * finish all prompts, calculations and generate the report. 2. else if driver
		 * is over limit by 20mph or less, charge $30 per every 5mph over limit. 3. else
		 * if driver is more than 20mph over limit charge $50 per every 5 mph over
		 * limit. 4. Don't mix rates! - driver is either charged $30 per 5mph over or
		 * $50 per 5mph over. 5. if the violation occurred in a construction zone, you
		 * are to **DOUBLE** the fine.
		 * 
		 * [comment]: <> (Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is
		 * under 21 AND more than 20mph over)
		 * 
		 * [comment]: <> (limit then you must add an additional straight $300 underage
		 * speeder fine. ** You are NOT to double)
		 * 
		 * [comment]: <> (this)
		 * 
		 * ### Contraints
		 * 
		 * - Only enter positive numbers for driver's age, speed limit and actual speed.
		 * - Don't enter ridiculously huge numbers. Your variables could overflow and
		 * formatting may not fit.
		 ** 
		 * Example:**
		 * 
		 * ```text What is driver's firstname? > Greg 
		 * What is driver's lastname? > Naman
		 * What is driver's age? > 30
		 *  What is the speed limit (mph)? > 25
		 *   What is driver's speed (mph)? > 45 
		 *   Is is a construction zone (Y/N)? > Y
		 * 
		 * =========REPORT=========
		 * 
		 * Driver name: Greg Naman
		 *  Age: 30 years old
		 *   Speed limit: 25 mph
		 *    Current speed:45 mph 
		 *    Construction zone (Y/N)?: Y 
		 *    Speeding fine: $120.00
		 * 
		 * ==========END===========
		 */

		Scanner sc = new Scanner(System.in);
		
		
		String name = "Mohammed";
		final int UNDER_AGE_FINE = 300;
		int age, spdLimit = 0, driverSpeed = 0;
		int spdFine = 0, totalUnderAgeFine = 0;
		char constructionZone;
		
		System.out.println("Enter your name: ");  
		name = sc.nextLine(); //Get name Input from User
		
		System.out.println("Enter your age: ");
		age = sc.nextInt(); // Get age from user
		
		System.out.println("Enter the speed Limit(MPH): ");
		spdLimit = sc.nextInt(); // Get actual speed limit
		
		System.out.println("Enter your speed(MPH): ");
		driverSpeed = sc.nextInt(); // // Get driver's speed
		
		System.out.println("Is it a construction zone(Y/N): ");
		constructionZone = sc.next().charAt(0);
		
		sc.close();
		
		int spdOverLimit = driverSpeed - spdLimit; 

		if (spdOverLimit <= 5) {

			spdFine = 0;

		} else if (spdOverLimit <= 20) {
			spdFine = 30 * (spdOverLimit / 5);
		} else {
			spdFine = 50 * (spdOverLimit / 5);
		}
		
		if (constructionZone == 'y') {
			spdFine*=2;
		}
		if (age <= 20 && spdOverLimit >= 5) {
			totalUnderAgeFine = UNDER_AGE_FINE;
		}


		System.out.printf("Driver Name: %s \nAge: %d \nSpeed Limit: %d", name, age, spdLimit);
		System.out.printf("\nCurrent Speed: %d \nConstruction Zone: %c \nSpeeding Fine: %d ", driverSpeed, constructionZone, spdFine);
		System.out.printf("\nUnder Age Fine: %d \nTotal Fine: $ %d ",totalUnderAgeFine,totalUnderAgeFine+spdFine);
		
		

	}

}
