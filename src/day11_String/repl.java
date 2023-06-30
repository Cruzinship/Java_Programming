package day11_String;
import java.util.Scanner;
public class repl {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        String result = "";
        if (word1.equals(word2)){
        result = "true";
    }else {
            result = "false";
        }
        System.out.println(result);



        }
    }
