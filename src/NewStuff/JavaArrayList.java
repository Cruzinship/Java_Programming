package NewStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList[] a1 = new ArrayList[20000]; //A way to make ArrayList With a constraint
        Scanner input = new Scanner(System.in); // Scanner made to take in information from HackerThingy

        int lists = input.nextInt(); //Tells us how many list there will be

        for (int i = 0; i < lists; i++){ //Loops as many times as there are lists
            a1[i] = new ArrayList(); //stores each list number we go through into a new Arraylist to stop this loop when so that it eventually stops out loop
            int number =  input.nextInt(); // to take in each input
            for (int j = 0; j < number; j++){ //loops everytime we add a new line of numbers(This depends on the first loop)
                int value = input.nextInt(); //takes in the values
                a1[i].add(value); // adds our values to the arraylist
            }
        }
        int queries = input.nextInt(); //Tells us how many queries there will be and we will loop for however many times are requested
        for (int i = 0; i < queries; i++) {
            int x = input.nextInt(); //Takes in the queries values
            int y = input.nextInt();
            try{
                System.out.println(a1[x-1].get(y-1)); // Since we are at index zero and this list we made starts at 1 we need to put -1 to start at 1
            }catch (Exception e){
                System.out.println("ERROR!"); //Try catch here was made to print error if a queries was out of bounds
            }
        }
    }
}
