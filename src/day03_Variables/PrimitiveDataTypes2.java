package day03_Variables;

public class PrimitiveDataTypes2 {
    public static void main(String[] args) {

        //DataType variableName = Data;

        char a ='@';
        char b ='!';
        //char ab ='ab'; Doesn't work due to being a multi char.
        //char can only hold char with single quote ''

        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------");

        char ch ='A';
        char ch2 =65;
        System.out.println(ch);
        System.out.println(ch2);

        System.out.println("-------------");

        char ch3 = 40000;

        System.out.println(ch3);

        int sum = 'A' + 'B'; // 131
        System.out.println(sum);

        System.out.println("-------------");
        //char ch4 = -100;

        // boolean r1 =123;
        // boolean r2 =2.5;
        // boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);
    }


}
