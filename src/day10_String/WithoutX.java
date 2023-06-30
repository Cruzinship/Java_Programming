package day10_String;
import java.util.Scanner;
public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        if(word.startsWith("x") ||  word.endsWith("x")){
            System.out.println(word.replace('x', ' ').trim());

        }else if(word.startsWith("X") || word.endsWith("X")){
            System.out.println(word.replace('X',' ').trim());
        }else{
            System.out.println(word);
        }


    }
}
