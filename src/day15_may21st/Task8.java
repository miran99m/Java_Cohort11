package day15_may21st;

import java.util.Random;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
//		## Task - Guessing Game
//
//		Create number guessing game between 1-100 for 1 player. the program should generate random number
//		between 1-100. then player keep guessing it until it's correct.
//
//		[comment]: <> (for 2 players.)
//
//		[comment]: <> (1st player will be the one who set the winner number.)
//
//		[comment]: <> (2nd player will be the one who guessing that number)
//
//		the program should have the following features:
//
//		- should ask name of the player
//		- have prompt to ask player to enter and the range of number.
//		```text
//		Please enter number between 1-100:
//		```
//		- if the guessing number is wrong, the program will give feedback to player that the guessing number
//		  is `greater` or `lower` than the winner number and ask player to try again
//
//		```text
//		<guess_number> is lower than winner number. Please try again
//		```
//
//		- the new prompt should get update with new range when, player enter the wrong guess
//
//
//		```text
//		// winner number is 45
//		Please enter number between 1-100:
//		>30
//		30 is lower than winner number. Please try again
//		Please enter number between 30-100:
//		>98
//		98 is higher than winner number. Please try again
//		Please enter number between 30-98:
//		```
//		- the program should keep track of the number of tries of the player
//		- if the player guess correct, it should display congratulation message, wining number, and number
//		  of tries
//
//		```
//		Congrats <name>, You've won. 
//		The winner number is <winner_number>
//		Your total guess are <number_of_times> times.
//		```
//
//		- after finish the program should prompt player to try again with display the high score of the
//		  previous game.
//
//		```
//		Would you like to try again. 
//		The best score is <number_of_guess> tries
//		```
//
//		Tip:
//		Use `Random` class and `.nextInt(100)` for generate random number between 1-100.

		int guessNumber;
		int numOfTries = 0;
		Scanner sc = new Scanner(System.in);

		String replay = "y";

		while (replay.equals("y")) {
			Random rd = new Random();
			int winnerNumber = rd.nextInt(100);
			System.out.println("Enter number between 1-100: ");
			guessNumber = sc.nextInt();

			for (int i = 0; i < 100; i++) {
				numOfTries++;
				System.out.println("");

				if (guessNumber == winnerNumber) {
					System.out.println(guessNumber + " Congratuation, You have WON!");
					break;
				} else if (guessNumber > winnerNumber) {
					System.out.println(guessNumber + " is greater that winning Number! Try Again! ");
					guessNumber = sc.nextInt();

				} else if (guessNumber < winnerNumber) {
					System.out.println(guessNumber + " is smaller that winning Number! Try Again! ");
					guessNumber = sc.nextInt();
				}

			}

			System.out.println("Tries: " + numOfTries);

			System.out.printf("The best score is %d tries", numOfTries);

			System.out.println("Would You like to try again?(y/n)?");
			replay = sc.next();
			if (replay.equals("n"))
				break;

		}

		sc.close();

	}

}
