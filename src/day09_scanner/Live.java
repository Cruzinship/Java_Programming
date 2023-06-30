package day09_scanner;

public class Live {
    public static void main(String[] args) {

        int residents = 9;

        String result = "";

        if (residents < 3) {
            result = "Lives with less than 3 people";

        } else if (residents >= 3 && residents < 7) {
            result = "Lives with 3-6 people";
        } else {
            result = "Live with more than 6 people";
        }
        System.out.println(result);
    }
}

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */
