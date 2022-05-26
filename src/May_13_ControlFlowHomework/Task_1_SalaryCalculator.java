package May_13_ControlFlowHomework;

public class Task_1_SalaryCalculator {

	public static void main(String[] args) {
		/*
		 * ## Task1 `Create a class called SalaryCalculator.
		 * java 1 declare the following
		 * variables: hourlyRate, weeklyHours, stateTaxRate, federalTaxRate 
		 * 2 use the
		 * given info in above variables to calculate the followings: 
		 * 1. salaryBeforeTax
		 * 2. stateTax
		 *  3. federalTax 
		 *  4. totalTax
		 *   5. salaryAfterTax
		 *    Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
		 * 
		 * 3 use print statement to print each of the above Ex: hourlyRate = $50
		 * weeklyHours = 45 stateTaxRate = 6 (given as percentage, you need to convert
		 * to decimal) federalTaxRate = 26 (given as percentage, you need to convert to
		 * decimal) output: Gross pay is: $117000 Federal tax is: $30420 State tax is:
		 * $7020 Total tax is: $37440 Net income is: 79560 `
		 */
		int hourlyRate = 50;
		int  weeklyHours = 45;
		int stateTaxRate = 6;
		int federalTaxRate = 26;
		
		int salaryBeforeTax = hourlyRate * weeklyHours * 52;
		int stateTax = salaryBeforeTax * stateTaxRate/100;
		int federalTax = salaryBeforeTax * federalTaxRate/100;
		int totalTax = stateTax + federalTax;
		int salaryAfterTax = salaryBeforeTax - federalTax - stateTax;
		
		
		
		System.out.println("Gross Pay is: " + salaryBeforeTax);
		System.out.println("Federal Tax is: " + federalTax);
		System.out.println("State Tax is: " + stateTax);
		System.out.println("Total Tax is: " + totalTax);
		System.out.println("Net Income is: " + salaryAfterTax);
		
		

	}

}
