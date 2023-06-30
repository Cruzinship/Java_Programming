package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score ");
        int score = input.nextInt();
        input.nextLine();
        String result = "";

        if (score >= 85 && score <= 100) {
            result = "A";
        } else if (score < 85 && score >= 70) {
            result = "B";
        } else if (score < 70 && score >= 55) {
            result = "C";
        } else if (score < 55 && score >= 40) {
            result = "D";
        } else if (score >= 0 && score < 40) {
            result = "F";
        } else {
            result = "Invalid score";
        }
        System.out.println("Your grade is = " + result);
        input.close();
    }
}

/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */