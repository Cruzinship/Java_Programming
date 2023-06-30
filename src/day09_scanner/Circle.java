package day09_scanner;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle");
        double r = input.nextDouble();
        input.nextLine();
        double area = r * r * 3.14;
        double perimeter = 2 * 3.14 * r;
        System.out.println("area = " + area);

        System.out.println("Perimeter = " + perimeter);
        input.close();
    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */
