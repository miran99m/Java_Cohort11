package day10_loopReview;

public class SumOfOddNumber {

	public static void main(String[] args) {

		int total = 0;
		int i = 1;
		
		do {
			if(i%2==1) {
				total+=i;
				
			}
			i++;
		
		}while(i < 101);
		
		System.out.println(total);
	}

}
