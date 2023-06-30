package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] myGroups = new String[5];

        myGroups[0] = "Gulcin";
        myGroups[myGroups.length - 1] = "Aseel";
        myGroups[2] = "Sumeye";
        myGroups[1] = "Anidullah";
        myGroups[3] = "Khashayar";


        System.out.println(Arrays.toString(myGroups));

        myGroups[1] = "Kuzzat";
        //myGroups[5] ="Muhtar";

        System.out.println(Arrays.toString(myGroups));

        System.out.println("-----------------------------------------");

        for (int i = myGroups.length - 1; i >= 0; i--) {
            System.out.println(myGroups[i]);
        }
        System.out.println("-----------------------------------------");
        for (int i = myGroups.length - 1; i >= 0; i--) {

        }
        //Array Varible.forr = reverse loop shortcut
        // Array VArible.for = normal loopshortc

    }
}

