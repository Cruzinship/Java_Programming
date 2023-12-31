package day09_scanner;

import java.util.Scanner;

public class JavaOutPutFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
//%-15s --> is used for -15 spaces right side for string
//%d is used for int
//%03 --> used for 3 spaces left side for int with starting 0
// Can only be done when using print formatting
//
        }
        System.out.println("================================");

    }
}
