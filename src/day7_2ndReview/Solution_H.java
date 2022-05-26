package day7_2ndReview;

import java.util.Scanner;

public class Solution_H {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers with space in-between: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if ((x>=8 && x<=10) || (y>=8 && y<=10) && (x>2 && y>2)) {
			System.out.println("Yes, you both will definitley get a table");
		}
		else if(x<= 2 && x>=0 || y<=2 && y>=0){
			System.out.println("Sorry, but no table for both of you");
		}
		else {
			System.out.println("Ahh, you maybe lucky tonight");
		}
	
	}

}
