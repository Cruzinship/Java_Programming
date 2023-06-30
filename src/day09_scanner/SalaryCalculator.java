package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your hourly rate ");
        int hourlyRate = input.nextInt();

        System.out.println("How many hours do you work in a week ");
        int hoursPerWeek = input.nextInt();

        System.out.println("Enter state Tax: ");
        double stateTax = input.nextDouble();

        System.out.println("Enter Federal Tax:");
        double federalTax = input.nextDouble();

        double salary = hourlyRate * hoursPerWeek;
        double netIncome1 = salary * federalTax ;
        double netIncome2 = salary * stateTax;
        double netIncome3 = netIncome1 + netIncome2;
        double netIncome = salary - netIncome3;

        System.out.println("Your net income is " + netIncome);


    }
}
/*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */