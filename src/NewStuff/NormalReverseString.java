package NewStuff;

public class NormalReverseString {
    public static void main(String[] args) {

        String name = "Patrick"; //first you state your variables
        String reverse = "";
        for(int i = name.length() - 1; i >= 0;  i--){ //make a loop which will go run as many times there are letters
            reverse += name.charAt(i); //this characters to the reverse string but thanks to the i-- this loop is going backwards
        }
        System.out.println("reverse = " + reverse);
    }
}


//i-- vs i++ This determines if the loop goes backwards or forwards
