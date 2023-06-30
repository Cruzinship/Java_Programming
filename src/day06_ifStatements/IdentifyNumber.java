package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
        boolean isPositive = number > 0; //if number is greater than zero than its a positive number
        boolean isNegative = number < 0;// if the number is less than zero
        boolean isZero = number == 0; // if the number is equal to zero
        boolean isZero2 = !isPositive && !isNegative; // if number is neither negative or positive it will be seen as zero

        System.out.println(number + " is a positive number : " + isPositive);
        System.out.println(number + " is a negative number : " + isNegative);
        System.out.println(number + " is zero : " + isZero);
        System.out.println(number + " is zero : " + isZero2);


    }
}
