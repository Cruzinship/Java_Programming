package day11_String;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word that starts with X");
        String sentence1 = input.next();
        sentence1 = sentence1.replaceFirst("x", "a");
        System.out.println(sentence1);
        input.close();
    }
}


/*
2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */