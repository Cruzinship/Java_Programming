package day14_ForLoop;
import java.util.Scanner;
public class FINRA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to count to 100: ");
        int x = s.nextInt();


        for (int i = x; i <= 100; i += x) {
            System.out.print(i + " ");

            if( i % 3 == 0){
                System.out.println("FIN");
            }
            if(i % 5 == 0){
                System.out.println("RA");
            }


        }
    }
}


/*
2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */