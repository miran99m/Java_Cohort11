package day15_may21st;

public class Task7 {

	public static void main(String[] args) {

		String str = "This";
		String sep = "And";
		String result = "";
		int numOfOccurence = 2;

		for (int i = 1; i <= numOfOccurence; i++) {
			result = result + str;
			if (i < numOfOccurence) {
				result += sep;
			}

		}
		System.out.println(result);
	}

}
