package day13_customMethods;
import java.util.Scanner;
public class returnStatementPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0); // Will take chars

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade =='D' || grade == 'F'; // only allows these inputs

        if(!isValid){ // if the grade is not valid
            System.err.println("Invalid grade");
            return;  // terminates the main method if contains an invalid grade
        }

        System.out.println(  (grade=='A')? "Excellent" :(grade=='B')? "Great job"  :(grade=='C')? "Good"
                :(grade =='D')? "Passed" : "Failed" );



    }



}
