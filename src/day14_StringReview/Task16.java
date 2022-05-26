package day14_StringReview;

public class Task16 {

	public static void main(String[] args) {

		String input = "abcabcabc";
		String characters = "";
		String distinctChars = "";

		for (int i = 0; i < input.length(); i++) {
			String currentChar = Character.toString(input.charAt(i));
			if (characters.contains(currentChar)) {
				if (!distinctChars.contains(currentChar)) {
					distinctChars += currentChar;
				}
			}

			characters += currentChar;
		}
		System.out.println(distinctChars);

	}

}
