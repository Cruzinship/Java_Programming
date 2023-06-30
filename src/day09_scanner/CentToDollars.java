package day09_scanner;
import java.util.Scanner;
public class CentToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of cents: ");

        int cents = input.nextInt();
        int ogCents = cents;
        int dollars = cents / 100;

        cents %= 100;

        System.out.println(ogCents + " cents equals to : " + dollars + " dollars and " + cents + " cents");

        input.close();

    }
}
