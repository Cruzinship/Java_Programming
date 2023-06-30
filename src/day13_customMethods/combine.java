package day13_customMethods;
public class combine {
    public static void main(String[] args) {
        System.out.println(combine("One", "eight"));
    }
    public static String combine(String first, String second){
       String result = "";
        if (first.charAt(first.length()-1) == second.charAt(0)){
            result = first + second.substring(1);
        }else{
            result = first + second;
        }
        return result;
    }
}

/*
5.  Create a method named combine that can take two string and then add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */