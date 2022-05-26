package may10th_homeworks_mohammed;

public class Task_5 {

	public static void main(String[] args) {
		/*
		 * Write a java program to print sum of odd number between 1 to 100.
		 */

//		int sum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				sum += i;
//			}
//		}
//		System.out.printf("The sum of odd number between 1 & 100 is %d", sum);

		
		int total = 0;
		
		int count = 1;
		
		while (count < 101) {
			if(count%2==1) {
				total += count;	
			}
			count++;
		}
		System.out.println(total);
	
	
	


}
}
