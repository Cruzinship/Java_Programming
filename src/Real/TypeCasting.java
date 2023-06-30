package Real;

public class TypeCasting {
    public static void main(String[] args) {
        //PRIMITIVE TYPE CASTING!!!(Topic 2)
        //The difference between these two would be the usage and syntax
        //for Explicit we need to write (int)(or Other types) next to the variable we are using to store value into the new variable

        //EXPLICIT CASTING EXAMPLE!!!
        //Used when putting a large value into small
        long PowerMeter = 200000;
        int PowerMeterCast = (int) PowerMeter;
        System.out.println("PowerMeterCast = " + PowerMeterCast);
        //IMPLICIT CASTING EXAMPLE
        //used when putting a smaller value into a larger
        byte PowerMeter2 = 100;
        short PowerMeter2Cast = PowerMeter2;
        System.out.println("PowerMeter2Cast = " + PowerMeter2Cast);
    }
}