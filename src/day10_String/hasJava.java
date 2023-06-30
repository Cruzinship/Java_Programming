package day10_String;
import java.util.Scanner;
public class hasJava {
        public static void main(String[] args) {
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            word = word.toLowerCase();
            if(word.length()>5){
                String a=word.substring(0,4);
                String b=word.substring(1,5);
                if(a.equals("java")||(b.equals("java"))){
                    exists=true;
                }else{
                    exists=false;
                }
            }

            System.out.println(exists);



        }
    }
/*
Use `String methods` to check if the given `word` contains the text `java`, but not anywhere in the String. The `java` text must be in either position 0 or position 1 of the String. If the text `java` appears in any other position it is not valid and is not considered to be found in the String. Output a `boolean value, true or false`.

#### Note: You won't be able to just use contains method

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    javapython

  Output:
    true
```

```
Ex:
  Input:
    cjavac++

  Output:
    true
```
```
Ex:
  Input:
    c#javaruby

  Output:
    false

  -> The 'java' is not in positions 0 or 1
 */