package day12_customMethods;

public class salary2 {
    public static void main(String[] args) {

salary(45.0, 40);
    }
    public static void salary(double hourlyRate, int weeklyHours){
double grossIncome = hourlyRate * weeklyHours;
double trueGrossIncome = grossIncome *52;
        System.out.println(trueGrossIncome);
    }
}

/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */