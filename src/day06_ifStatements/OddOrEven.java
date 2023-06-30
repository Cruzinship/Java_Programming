package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args){
        
        int number = 20;

        boolean isEven = number % 2 == 0; // When we divide a number by 2 if the remainder is zero it means the number is even
        // boolean isOdd = number % 2 != 0;
        // When we divide by a number by 2 if the remainder is NOT zero it is odd

        boolean isOdd = !isEven; //if the number is not even, then it's odd

        System.out.println(number + " is an even number: " +isEven );
        System.out.println(number + " is an odd number: " +isOdd);
        
        
        
        
        
        
    }
}
