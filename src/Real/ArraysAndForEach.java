package Real;

public class ArraysAndForEach {
    public static void main(String[] args) {
        //ARRAYS(Topic 7) DATA STRUCTURES
        //Size of an array is fixed. faster Array processes data faster than any other Data Structure
        //Supports both primitives and non primitives data types
        //Can be multiDimensional

        int[] arr = {10, 20, 30, 40, 50}; // This array already has a size and elements stored
        int[] arr2 = new int[5]; //This sets the size and accepts input
        arr2[2] = 300; //You may locate A index and input a value into it
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(arr2));

        int[] arr3 = new int[10]; //{0,0,0,0,0,0,0,0,0,0}
        for (int i = 0, j = 2; i < arr3.length; i++, j += 2) {
            arr3[i] = j;
        }
        System.out.println(java.util.Arrays.toString(arr3));

        //FOR-EACH LOOP aka the Data Loop(TOPIC 8)
        //There must be a data structure for this to work
        //number of iterations and order of the iteration are fixed
        for (int each : arr3) {
            System.out.println(each);
        }

    }
}
