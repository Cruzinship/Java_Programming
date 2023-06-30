package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalIntro {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = { 40 ,50 ,60, 70 ,80};
        int[] arr3 = {90, 100};

        System.out.println("-----------------------------------------");

        int[][] arr20 = { {10, 20, 30}, { 40 ,50 ,60, 70 ,80}, {90, 100}  };

        System.out.println(arr20.length);

        System.out.println(Arrays.toString(arr20[1]));
        System.out.println(Arrays.toString(arr20[2]));
        System.out.println(Arrays.toString(arr20[0]));

        System.out.println(arr20[2][0]);

        System.out.println(arr20[1][2]);
    }
}
