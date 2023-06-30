package NewStuff;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {

        String s = a.toLowerCase(); //makes it so its read as lower case in our console
        String s1 = b.toLowerCase();

        while (s.length() == s1.length() && s.length() != 0) {
            char c = s.charAt(0);
            String a1 = s.replace(c + "", "");
            String b1 = s1.replace(c + "", "");
            s = a1;
            s1 = b1;
        }
        if (s.length() == s1.length()) return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

