package day11_String;
import java.util.Scanner;
public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word1 = input.next();
        boolean ly = word1.endsWith("ly");


        if (ly == true) {
            System.out.println("really???");
        }else{
            System.out.println("nevermind");
        }
    }
}

/*
4. Create a class named ReallyNeverMind.
 Ask the user to enter a word. if the word ends with "ly", print "really???"
  ,  otherwise, print "never mind"

 */