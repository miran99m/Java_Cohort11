package day5_operators;

public class ConstantValue {

	public static void main(String[] args) {

		
		final int numberOfUser = 4;
		
		System.out.println(numberOfUser);
		
//		numberOfUser = 8; // cannot modify because it is final 
		
		System.out.println(numberOfUser);
		
		
		final float PI = 3.14f;
		
		System.out.println(PI);
		
		final long daysInWeek = 70000000000000000L;
		
		System.out.println(Integer.MAX_VALUE);
		
		long value = 2147483648L;
		
		
		
		
		
		
		int A = 10;
		int B = 3;
		int C = 4;
		int D = 5;
		
		System.out.println(A % B); // 1 == > (3,3,3,1)
		
		System.out.println(A % C); //2 ==> (4,4,2)
		
		System.out.println(A % D); 
		
		System.out.println(23 % 6); // 6, 6, 6, 5
		System.out.println(24 % 6); 

	}

}
