package day21_multiDimensionalArray;

import day14_ForLoop.EachLetter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        //Elements         0    1  2      0    1   2   3  4     0    1
        int[][] arr20 = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        //Id Array                      0                  1               2
        for (int i = 0; i < arr20.length; i++) { // i: index number of 10 array in arr20

            int[] each1D = arr20[i];

            System.out.println(Arrays.toString(each1D));
// for loop
            for (int j = 0; j < each1D.length; j++) {// j: index number of elements in each 1D array of arr2D

                int eachElement = each1D[j];

                System.out.println(eachElement);
            }
        }
        System.out.println("-----------------------------------------------");
// for each
        for (int[] each1DArray : arr20) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }
        //short way
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < arr20.length; i++) {
            for (int j = arr20[i].length - 1; j >= 0; j--) {
                System.out.println(arr20[i][j]);


            }
        }
        System.out.println("-----------------------------------------------");

        for (int[] eachArray : arr20) {
            for (int eachElement : eachArray) {
                System.out.println(eachElement);
            }
        }
    }
}



