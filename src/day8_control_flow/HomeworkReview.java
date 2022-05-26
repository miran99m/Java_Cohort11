package day8_control_flow;

public class HomeworkReview {

	public static void main(String[] args) {
		
		double n1 = 20;
		double n2 = -3;
		double n3 = 10;
		

		if (n1 > n2) {
			if(n1 > n3) {
				System.out.println("n1 <"+n1+"> is bigger");
			}
		}
		
		if (n2 > n1) {
			if(n1 > n3) {
				System.out.println("n2 <"+n2+"> is bigger");
			}
		}
		
		if(n3 > n1) {
			System.out.println("n3 <"+n3+"> is bigger");
		}
			
	
	
	
	}
}
