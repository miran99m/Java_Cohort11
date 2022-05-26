package day9_control_flow;

public class ContinueStatement {

	public static void main(String[] args) {

		int i = 1;
		
		while(i<11) {
			if(i == 5) {
				continue;
			}
				System.out.println(i);
				i++;
			}
		}
		
		
	

}
