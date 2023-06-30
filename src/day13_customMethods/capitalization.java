package day13_customMethods;

public class capitalization {
    public static void main(String[] args) {
        String word1 = capitalization("jAvA");

        System.out.println(word1);

    }
    public static String capitalization(String word){
        String word1 = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return word1;
    }
}
/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */
