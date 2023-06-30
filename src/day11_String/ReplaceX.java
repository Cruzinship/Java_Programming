package day11_String;
import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a word that starts with X");
        String sentence1 = input.next();
        sentence1 = sentence1.replace("x", "a");
        System.out.println(sentence1);
        input.close();
    }
}