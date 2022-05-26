package day15_may21st;

public class Task5 {

	public static void main(String[] args) {

//		## Task - Seeing Double?
//
// Given a string, return a string where for every char in the original, there are two chars.
//
//				Example:
//
//				```text
//				Input   : The
//				Output  : TThhee
//
//				Input   : AAbb
//				Output  : AAAAbbbb
//
//				Input   : Hi-There
//				Output  : HHii--TThheerree
//				```
		
		String str = "AAbb";
		String total = "";
		
		for (int i = 0; i < str.length(); i++) {
			total += str.charAt(i);
			total += str.charAt(i);
		}
		System.out.println(total);

	}

}
