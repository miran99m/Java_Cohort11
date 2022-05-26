package day5_operators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a > b); // false
		
		System.out.println(a < b); // true 
		
		boolean result = a < b; // true
		System.out.println(result);
		
		result = a == b; // false
		System.out.println(result); //false
		System.out.println(a != b);
		
		result = a + b == c;
		System.out.println(result);
		System.out.println(a * b >= c);
		
		result = a + b <= c;
		System.out.println(result);
		System.out.println(a + b >= c);
		
	}

}
