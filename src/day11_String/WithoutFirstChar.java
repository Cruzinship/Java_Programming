package day11_String;
import java.util.Scanner;
public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word");
String word1 = input.next();
        System.out.println("Please enter second word");
        String word2 = input.next();

        word1 = word1.replaceFirst("a", "");
        word2 = word2.replaceFirst("b", "");


        System.out.println(word1 + word2);
    }
}


/*
5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */