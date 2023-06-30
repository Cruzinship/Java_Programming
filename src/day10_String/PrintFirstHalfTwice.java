package day10_String;
import java.util.Scanner;
public class PrintFirstHalfTwice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();


        int begining = word.length();
        int half = begining / 2;



        if (half <= 2) {
            System.out.println(word.substring(0, 2) + word.substring(0, 2));
        } else if (half == 3) {
            System.out.println(word.substring(0, 3) + word.substring(0, 3));
        } else {
            System.out.println(word.substring(0, 4) + word.substring(0, 4));
        }
    }
}
/*
Use `String methods` to print the first half of the given `word`, twice. Find the beginning half of the String and concatenation it twice.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    java

  Output:
    jaja
```

```
Ex:
  Input:
    unity

  Output:
    unun
 */