package day15_whileLoop;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483648; // any interger will always be greater than this
        int min = 2147483647; // any interger will always be smaller than this
        for(int i = 0; i < 5; i++){
            System.out.println("Enter number:");
            int num = input.nextInt();
            if (num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}