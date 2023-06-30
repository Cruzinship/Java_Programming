package day11_String;
import java.util.Scanner;
public class anotherfunnireplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String word2 = word.replace("dumb", "cool");
        System.out.println(word2);
        }
    }


/*
Use `String methods` to take the given `str`, which has a bad word, and change the bad word into something nice. Print the fixed String

> - Change the bad word `dumb` into `cool`

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation
```
Ex:
  Input:
    You are so dumb

  Output:
    You are so cool
```
```
Ex:
  Input:
    I'm dumb for failing the quiz

  Output:
    I'm cool for failing the quiz
```
 */