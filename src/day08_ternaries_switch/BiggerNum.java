package day08_ternaries_switch;

public class BiggerNum {
    public static void main(String[] args) {

        int n1 = 2,
                n2 = 5,
                n3 = 8;

        String result = "";

        result =  (n1 > n2 && n1 > n3)? "n1 is biggest" :(n2 > n1 && n2 > n3)? "n2 is biggest" : "n3 is biggest";

        System.out.println(result);


    }
}


/*
6. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */