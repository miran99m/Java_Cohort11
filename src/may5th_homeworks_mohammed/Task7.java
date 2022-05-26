package may5th_homeworks_mohammed;

public class Task7 {

	public static void main(String[] args) {

		String name = "John";
		String message = name + " is eligible to vote?";
		String citizenship = "USA";
		boolean isEligible;

		if (citizenship == "USA") {
			isEligible = true;
		} else {
			isEligible = false;
		}
		System.out.println(message + "\n" + isEligible);
	}

}
