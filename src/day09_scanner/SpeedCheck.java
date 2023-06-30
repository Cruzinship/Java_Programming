package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your current speed: ");
        int speed = input.nextInt();
        input.nextLine();

int speedLimit = 55;
int speedOver = speed - speedLimit;

        if (speed > speedLimit){
        System.out.println("You are driving " + speedOver + " over the limit, slow down!");
    }else {
            System.out.println("You speed is under the limit");
        }
       input.close();
}
}


/*

4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */