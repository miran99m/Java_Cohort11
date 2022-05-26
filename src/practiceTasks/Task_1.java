package practiceTasks;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n >= 100)
        {
        System.out.println("Re-enter the number(n<100): ");
        n=sc.nextInt();
        }
       
        int b=n%10; // Last Digit!!
        int a=n/10; //  Last Digits get removed
 
        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
       
        if(a==1)
        {
            System.out.println(two_digits[b+1]);
        }
        else if(b==0)
            System.out.println(tens_multiple[a]);
        else
            System.out.println(tens_multiple[a]+" "+single_digits[b]);
    }//main

	
}
