package NewStuff;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {
//reverse a string and verify if it is able to spelled backwards the same as it is normally
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            reverse += A.charAt(i);
            System.out.println(reverse);
        }
        if (A.equals(reverse)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
