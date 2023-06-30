package day16_nestedloop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = input.next();
        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {// if credentials are valid
            System.out.println("Logged in");
        } else {//otherwise if credentials are incorrect
            System.out.println("Your account is locked");

            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {// if user enters valid credentials then break will end the loop
                    System.out.println("Logged in");
                    break;

                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account is now locked, please contact with the support team");
            }
        }
    }
}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:


        username: Cydeo
        password: WoodenSpoon
        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched, the program should allow
        the user to have three attempts to enter correct credentials
        if all three attempts are failed, then print "Your account is lucked."
*/