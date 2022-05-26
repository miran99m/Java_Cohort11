package May_13_ControlFlowHomework;

public class Task_4 {

	public static void main(String[] args) {

//		`Write a program that can calculate the salary after tax based on the following requirements
//        the tax rates are:
//          35% for salary of 130K or more
//			30% for salary of 100K to 130k (excluded)
//			25% for salary of 80K to 100K (excluded)
//			20% for salary less than 80K
//        in addition, if the person is married, he/she will pay 5% less tax
		double salaryInput = 130000;
		char married = 'Y';
		int salaryAfterTax;
		int taxRate = 0;

		if (salaryInput >= 130000) {
			taxRate = 35;
			salaryAfterTax = (int) (salaryInput - (int) (salaryInput * taxRate / 100));

		} else if (salaryInput >= 100000 && salaryInput < 130000) {
			taxRate = 30;
			salaryAfterTax = (int) (salaryInput - (int) (salaryInput * taxRate / 100));

		} else if (salaryInput >= 80000 && salaryInput < 100000) {
			taxRate = 25;
			salaryAfterTax = (int) (salaryInput - (int) (salaryInput * taxRate / 100));

		} else {
			taxRate = 20;
			salaryAfterTax = (int) (salaryInput - (int) (salaryInput * taxRate / 100));
		}

		if (married == 'Y') {
			taxRate -= 5;
			salaryAfterTax = (int) (salaryInput - (int) (salaryInput * taxRate / 100));
		}

		System.out.println("Your Salary is " + salaryAfterTax);

	}

}
