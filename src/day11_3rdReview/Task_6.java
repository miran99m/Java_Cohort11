package day11_3rdReview;

public class Task_6 {

	public static void main(String[] args) {
//		Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
//				return 0 if neither is in that range.
//
//				Example:
//				```text
//				11 19
//				19
//
//				19 11
//				19
//
//				11 9
//				11
//				```

		int input1 = 11;
		int input2 = 19;
		int max = 0;

		if ((input1 >= 10 && input1 <= 20) && (input2 >= 10 && input2 <= 20)) {
			if (input1 > input2) {
				max = input1;
			} else {
				max = input2;
			}
		} else if (input1 >= 10 && input1 <= 20) {
			max = input1;
		} else if (input2 >= 10 && input2 <= 20) {
			max = input2;
		} else {
			max = 0;
		}

		System.out.println(max);

	}
}
