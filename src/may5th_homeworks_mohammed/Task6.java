package may5th_homeworks_mohammed;

public class Task6 {

	public static void main(String[] args) {

		int score = 100;
		String letterGrade;
		double gpa = 0;

		if (score >= 0 && score <= 100) {

			if (score >= 97 && score <= 100) {
				letterGrade = "A+";
				gpa = 4.0;

			} else if (score >= 93 && score <= 96) {
				letterGrade = "A";
				gpa = 3.9;

			} else if (score >= 90 && score <= 92) {
				letterGrade = "A-";
				gpa = 3.7;

			} else if (score >= 87 && score <= 89) {
				letterGrade = "B+";
				gpa = 3.3;

			} else if (score >= 83 && score <= 86) {
				letterGrade = "B";
				gpa = 3.0;

			} else if (score >= 80 && score <= 82) {
				letterGrade = "B-";
				gpa = 2.7;

			} else if (score >= 77 && score <= 79) {
				letterGrade = "C+";
				gpa = 2.3;

			} else if (score >= 73 && score <= 76) {
				letterGrade = "C";
				gpa = 2.0;

			} else if (score >= 70 && score <= 72) {
				letterGrade = "C-";
				gpa = 1.7;

			} else if (score >= 67 && score <= 69) {
				letterGrade = "D+";
				gpa = 1.3;

			} else if (score >= 63 && score <= 66) {
				letterGrade = "D";
				gpa = 1.0;

			} else if (score >= 60 && score <= 62) {
				letterGrade = "D-";
				gpa = 0.7;

			} else {
				letterGrade = "F";
				gpa = 0.0;

			}

			System.out.println("SCORE: " + score + "\nGRADE: " + letterGrade + "\nGPA: " + gpa);

		} else {
			System.out.println("You have entered an invalid Number!");
		}
	}

}
