package Real;

public class Loops {
    public static void main(String[] args) {
        //LOOPS(Topic 6) Loops themselves are used for well Looping. you can use these for whatever you need them. Maybe you need to go through an array.
        //Perhaps reverse a string I don't know you name it bro
        //for loop: Iteration number is fixed/known
        //for(initialization; condition, Iterator){} Example
        int loops = 5;
        for (int i = 0; i < loops; i++) {
            System.out.println("Loops 5 times");
        }
        //While Loop: //This is the best to use if the number of iteration is unknown/not fixed
        //while(Condition){} This condition must be true in order to loop
        // Example
        int counter = 0;
        while (counter <= 9) {
            counter++;
            System.out.println("counter = " + counter);
        }
        //break; used to break a loop
        //continue; jumps to the next iteration of the loop
        //return; exits the current method
        //do-While loop: At least gets executed once. Will run before everything else
    }
}
