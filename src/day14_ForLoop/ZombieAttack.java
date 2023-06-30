package day14_ForLoop;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;


        for (; inhabitants > 0; inhabitants /= 2) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}

