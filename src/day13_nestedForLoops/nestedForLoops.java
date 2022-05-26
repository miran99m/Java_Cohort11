package day13_nestedForLoops;

import java.util.Scanner;

public class nestedForLoops {

	public static void main(String[] args) throws InterruptedException {

//		// I want to count 1 to 10 five times....
//		
//		for(int i=1; i <=5; i++) {
//			
//			for(int j=1; j <=10; j++) {
//				System.out.println(j);
//			}
//			
//		}
		Scanner sc = new Scanner(System.in);
		
		int waitTime = sc.nextInt();

		System.out.println("2 Minute Timer Starts");

		for (int i = waitTime - 1; i >= 0; i--) {

			for (int j = 59; j >= 0; j--) {
				System.out.println(i + ":" + j);
				Thread.sleep(1000);

			}
		}
		
		System.err.println("Time is up");

//		for (int i = 4; i >= 0; i--) {
////			System.out.println(i);
//			
//			for(int j = 59; j >= 0; j--) {
//				System.out.println(i + ":"+ j);
//				Thread.sleep(1000);
//			}
//			
//			
//		}

//		for(int j = 59; j >= 0; j--) {
//			System.out.println(j);
//		}

	}

}
