package day15_whileLoop;

public class RemovingDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = ""; // "a"
        for (int i = 0; i < str.length(); i++) {//i: index numbers of str

            char each = str.charAt(i); // each character of the given string

            if (!result.contains("" + each)) { // if the string result does not contain the character of str yet
                result += each;// then we will add the character to string result
            }

        }
        System.out.println(result);// if the character isa not contained yet in the new string, then we will add it ot the new string
    }
}
/*
3. Write a program that can remove the duplicated characters from a string

        Ex:
        str = "aabbbcccc"
        output:
        abc

 */