package day03_Variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {
        // Datatype VaribaleName = Data;

        //byte a = "Java"; // byte only accepts integer values(-128 ~ 127)
        //byte a = 20.5; // byte cannot take decimal numbers
        //byte a = 2000; // out of bytes range(-128 ~ 127)
        byte a = 20;
        //price of the car is $17500
        short p = 17500;

        System.out.println(a);
        System.out.println(p);

        // salary us $95000

        int s = 95000; //preffered datatype
        System.out.println(s);

        long n = 9999999999l;
        System.out.println(n);

        //gpa is 3.5
        double gpa1 = 3.5;
        System.out.println(gpa1);

        float gpa2 =3.5f;
        System.out.println(gpa2);
    }

}
