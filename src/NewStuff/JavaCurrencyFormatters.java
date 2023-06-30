package NewStuff;

import javax.print.attribute.standard.MediaSize;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatters {
    //Use CurrencyInstanceFormatter to print out different forms of currency in the console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

       System.out.println("US: " + us);
       System.out.println("India: " + india);
       System.out.println("China: " + china);
       System.out.println("France: " + france);
    }
}
