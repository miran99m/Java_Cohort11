package day13_nestedForLoops;

public class Homework_Review {

	public static void main(String[] args) {

//		for (int i = 1; i < 101; i++) {
//
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println("Finra ");
//			} else if (i % 3 == 0) {
//				System.out.println("FIN ");
//			} else if (i % 5 == 0) {
//				System.out.println("RA ");
//			} else {
//				System.out.println(i + " ");
//			}
//		}
		
		int fact = 1;
		int input = 1;
		for (int i = 5; i >= 1; i-- ) {
			System.out.println(i);
			fact*=i;
			
		}
		System.out.println(fact);
	}

}
