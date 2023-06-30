package day11_String;
import java.util.Scanner;
public class moreReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
String result = "";
        if (sentence.contains(word)){
            result = "true";
        }else{
            result = "false";
        }
        System.out.println(result);
    }
}
