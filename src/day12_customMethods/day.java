package day12_customMethods;

public class day {
    public static void main(String[] args) {
day(7);

    }
    public static void day(int number){

        String number1 = (number == 1) ?  "Monday" : (number == 2) ?  "Tuesday" : (number == 3) ?  "Wednesday" : (number == 4) ?  "Thurdays"
                : (number == 5) ?  "Friday" : (number == 6) ? "Saturday" : (number == 7) ?  "Sunday" : "Invalid";
        System.out.println(number1);

    }
}

/*

4. Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */