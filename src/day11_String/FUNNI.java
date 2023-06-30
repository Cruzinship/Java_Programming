package day11_String;

import java.util.Scanner;

public class FUNNI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String upperCaseWord = word.toUpperCase();
        String lowerCaseWord = word.toLowerCase();

        System.out.println("word: " + word);
        System.out.println("upperCase: " + upperCaseWord);
        System.out.println("lowerCase: " + lowerCaseWord);
        }
    }


/*
Use `String methods` to change the given `word` to all uppercase characters and all lowercase characters. The value of `word` will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

> word: $given word

> uppercase: $given word as all uppercase

> lowercase: $given word as all lowercase

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    jAVa

  Output:
    word: jAVa
    uppercase: JAVA
    lowercase: java
 */