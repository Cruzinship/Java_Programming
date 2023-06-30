package day16_nestedloop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java";
        String word = "Java";
sentence = sentence.toLowerCase();
word = word.toLowerCase();

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst("Java", "");
        }
        System.out.println(count);
    }
}
/*
We count by removing Java
"Java Java Java Java":0
"Java Java Java": 1
"Java Java": 2
"Java": 3
"": 4
 */