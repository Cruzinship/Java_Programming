package day09_scanner;

import java.io.*;
import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

       while(input.hasNextLine()) {
           counter++;
           String line = input.nextLine();
           System.out.println(counter + " " + line);


       }
    }
}
