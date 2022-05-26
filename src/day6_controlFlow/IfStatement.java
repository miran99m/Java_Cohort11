package day6_controlFlow;

public class IfStatement {

	public static void main(String[] args) {

		// Decision making Statements
		// if statements and switch case
		
		//syntax:
		
		/*
		 * if (condition) {
		 * 		statement1
		 * }else{
		 * 		statement2
		 * }
		 * */
		
		
		int a = 5;
		int b = 7;
		
		if (a > b) {
			System.out.println("a is greater" );
		}else {
			System.out.println("b is greater");
		}
		
		
		int count = 2;
		int total = 4;
		
		if (count < 12) {
			total = 0;
		}else {
			total = total + count;

		}
		System.out.println(total);
		
	}

}
