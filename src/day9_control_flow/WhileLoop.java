package day9_control_flow;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		
		while (i<5) {
			System.out.println(i);
			i++;
		}
		
		int x = 10;
		int y = 20;
		
		while (x<y) {
			System.out.println("Value of x: "+ x);
			x++;
		}
		
		if(true) {
			System.out.println("Hello Cohort 11");
		}
		System.out.println("------------------------------");
		
		int count = 1;
		while(true) {
			System.out.println("Hello Cohort 11");
			
			if(count == 5) {
				break;
			}
			count++;
		}
		
		
		
	}
	

}
