package day13_customMethods;

import java.util.Locale;

public class FrequencyOfWord {
    public static void main(String[] args) {
        int frequencyOfWord = FrequencyOfWord("Java java jAvA","java");
        System.out.println(frequencyOfWord);
    }
    public static int FrequencyOfWord(String sentence, String word){
        int lengthBefore = sentence.length();
sentence = sentence.toLowerCase().replace(word.toLowerCase(),word.substring(1));
        int lengthAfter = sentence.length();
        int frequencyOfWord = lengthBefore - lengthAfter + 1;

        return frequencyOfWord;
    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4

 */