package day2_variables;

public class PrintStatements {

	public static void main(String[] args) {

	

		String line1 = "* * * * * * ==================================\n * * * * *  ==================================";
		String line2 = "==============================================";
		for (int i = 0; i < 4; i++) {
			System.out.print(line1);
		}
		System.out.println("* * * * * * ==================================");

		for (int i = 0; i < 6; i++) {
			System.out.println(line2);
		}
	}
}
