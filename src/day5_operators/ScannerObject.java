package day5_operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a number for 'a Variable'");
//		
//		int a = sc.nextInt();
//		
//		
//		System.out.println("Enter a number for 'B Variable'");
//		
//		int b = sc.nextInt();
//		
//
//		int result = a + b;
//		
//		System.out.println("Answer: " + result);
//		
//		System.out.println("What is your name ?");
//		
//		String name = sc.nextLine();
//		
//		System.out.println("Hello, " + name);
//		
//		sc.close();
//		
		 
		// num 1 = 20;
		// num 2 = 30;
		// output :
//			30 is the max number
//		num 1 = 20;
//			num 2 = 20;
//			output:
//				both numbers are equal

		//TASK 1
//		System.out.println("Please enter a whole number");
//		int num = sc.nextInt();
//		
//		if(num %2 ==0) {
//			System.out.println(num + " is an even number");	
//		}
//		else {
//			System.out.println(num + " is an odd number");
//		}
//		
//		sc.close();
//		
//		
//		
//		
		
		
		
		
		
		
// task 2		
		
//		System.out.println("Please enter number 1");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Please enter number 2");
//		int num2 = sc.nextInt();
//		
//		if(num1 == num2) {
//			System.out.println("Both numbers are equal!");
//		}
//		else if(num1 > num2) {
//			System.out.println(num1 + " is the maximum number!");
//		}
//		else {
//			System.out.println(num2 + " is the maximum number");
//		}
//		
//		sc.close();
		
// Task 3
//		char letterGrade = ' ';
		
//		A+	97–100%	4.0
//		A	93–96%	3.9
//		A−	90–92%	3.7
//		B+	87–89%	3.3
//		B	83–86%	3.0
//		B−	80–82%	2.7
//		C+	77–79%	2.3
//		C	73–76%	2.0
//		C−	70–72%	1.7
//		D+	67–69%	1.3
//		D	63–66%	1.0
//		D−	60–62%	0.7
//		F	0–59%	0.0
//		
		int score = 85;
		String letterGrade;
		double gpa = 0;
		
		
		if (score >= 0 && score <=100) {
		
			if (score >= 97 && score <=100 ) {
				letterGrade = "A+";
				gpa = 4.0;
				
			}else if (score >= 93 && score <=96) {
				letterGrade = "A";
				gpa = 3.9;

				
			}else if (score >= 90 && score <=92) {
				letterGrade = "A-";
				gpa = 3.7;

				
			}else if (score >= 87 && score <= 89 ){
				letterGrade = "B+";
				gpa = 3.3;

				
			}else if (score >= 83 && score <= 86 ){
				letterGrade = "B";
				gpa = 3.0;

			}else if (score >= 80 && score <= 82 ){
				letterGrade = "B-";
				gpa = 2.7;

			}else if (score >= 77 && score <= 79 ){
				letterGrade = "C+";
				gpa = 2.3;

			}else if (score >= 73 && score <= 76 ){
				letterGrade = "C";
				gpa = 2.0;

			}else if (score >= 70 && score <= 72 ){
				letterGrade = "C-";
				gpa = 1.7;

			}else if (score >= 67 && score <= 69 ){
				letterGrade = "D+";
				gpa = 1.3;

			}else if (score >= 63 && score <= 66 ){
				letterGrade = "D";
				gpa = 1.0;

			}else if (score >= 60 && score <= 62 ){
				letterGrade = "D-";
				gpa = 0.7;

			}else {
				letterGrade = "F";
				gpa = 0.0;

			}
			
			System.out.println("SCORE: " + score + "\nGRADE: " + letterGrade + "\nGPA: " + gpa);

		} else {
			System.out.println("You have entered an invalid Number!");
		}
		
		
		
		
		
		//If score > 0 && score <=100;
		/*
        1. write a program that can check if the person is eligible to buy alcohol
                Ex:
                    name = "James"
                    age = 19
                    output:
                        James is eligible to buy alcohol?
                            false
         */
		
		boolean isEligible;	
		int personAge = 11;
		
		if (personAge >= 21) {
			isEligible = true;
		}
		else {
			isEligible = false;
		}
		
		System.out.println(isEligible);
		
		
		
	}

}
