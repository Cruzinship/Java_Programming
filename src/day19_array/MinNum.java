package day19_array;

public class MinNum {
    public static void main(String[] args) {


        int[] numbers = {100, 20, 500, 40, -10, 30};
        int min = numbers[0]; //// assume that first element is the maximum number

        for (int i = 0; i < numbers.length; i++) {// i: 1, 2, 3, 4...
            if (numbers[i] < min) {// compares the element of the array with current maximum number
                min = numbers[i];// replace the current maximum number
            }
        }
        System.out.println("min = " + min);
    }
}