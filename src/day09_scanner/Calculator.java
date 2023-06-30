package day09_scanner;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter a math operator: ");
        String mathOperator = input.next();

        System.out.println("Enter the second number: ");
        double n2 = input.nextDouble();

        switch(mathOperator){

            case "+" :
                System.out.println("Result = " + (n1 + n2));
                break;

            case "-":
                System.out.println("Result = " + (n1 - n2));
                break;

            case "*" :
                System.out.println("Result = " + n1 * n2);
                break;

            case "/" :
                System.out.println("Result = " + n1 / n2);
                break;

            default:
                System.out.println("Invalid entry");
        }

        input.close();


    }
}
