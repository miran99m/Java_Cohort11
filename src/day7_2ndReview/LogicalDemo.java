package day7_2ndReview;

public class LogicalDemo {

	public static void main(String[] args) {

		/*
		 * Logical Operator = boolean expression
		 * result always be true or false
		 * 
		 * NOT - !   = Unary Operator
		 */
		boolean isTall = true;
		System.out.println(!isTall); //False 
		
		// AND - && ==> Binary Operator
		// all of operands need to be true then result == true
		boolean b1 = false && false;
		boolean b2 = false && true;
		boolean b3 = true && false;
		boolean b4 = true && true;

		System.out.println(false && true && 10 > 3 && true);
		// OR - ||
		// Atleast one of operand is true then result == true
		System.out.println(true || false || false || true);
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMyType = isHandsome && isRich;
		System.out.println(isMyType);
		
		
		
		boolean b = true && !false;
		System.out.println(b);
		boolean b10 = (false || true) && !false;
				System.out.println(b10);
		
		
		
	}

}
