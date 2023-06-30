package day06_ifStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;

        boolean isDivisible2 = number % 2 == 0;
        // evenly divisible by 2
        boolean isDivisible3 = number % 3 == 0;
        //if the remainder is evenly divisible by 3
        boolean isDivisible5 = number % 5 == 0;
        // if the remainder is evenly divisible by 5

        System.out.println(number + " is divisible by : " + isDivisible2);
        System.out.println(number + " is divisible by : " + isDivisible3);
        System.out.println(number + " is divisible by : " + isDivisible5);




    }
}
