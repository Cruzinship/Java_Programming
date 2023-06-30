package day16_nestedloop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("------------------");



        for (int i = 0; i < 5; i++) {//outer loop. When its runs 1 time the inner loop will run 5 times
            //the outer loop will run the inner loop
            for (int j = 0; j < 5; j++) {// inner loop
                System.out.println("Wooden Spoon");
            }
        }
    }
}