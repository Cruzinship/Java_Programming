package day16_nestedloop;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        String str = "accccccbbbcccc";
        char ch = 'c';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {// i: index numbers of str

            if (str.charAt(i) == ch) {// if the character of this string is equal to the given character than it means the given character has appeared in this string
                count++;// adds plus 1 to count
            }
        }
        System.out.println(count);
    }
}
/*
 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'
		     output:
		     	5
 */