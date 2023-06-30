package day11_String;
import java.util.Scanner;
public class more_Replits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.next();

        int n1 = word.indexOf("a");
        System.out.println("index of a: " + n1);
    }
}
/*
Use `String methods` to find the index of the letter `a` in the given `word`. Print the index of the character:

> Index of a: $index number

#### Note: If there is multiple occurrences of the letter `a` we will output only the index of the first occurrence

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation
Ex:
  Input:
    apple

  Output:
    Index of a: 0
Ex:
  Input:
    java

  Output:
    Index of a: 1
Ex:
  Input:
    pen

  Output:
    Index of a: -1
 */
