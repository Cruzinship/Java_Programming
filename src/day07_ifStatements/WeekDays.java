package day07_ifStatements;

public class WeekDays {
    public static void main(String[] args) {

        int number = 5;
        String result = "";

        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        } else if (number == 3) {
            result = "Wednesday";
        } else if (number == 4) {
            result = "Thursday";
        } else if (number == 5) {
            result = "Friday";
        }
        else if (number == 6) {
            result = "Saturday";
    }else{
            result = "Sunday";
        }
        System.out.println(result);




    }
}

/*
Task6

1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */

