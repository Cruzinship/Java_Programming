package day37_exception;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str = "Java";

    //    char ch = str.charAt(250); // unchecked exceptions
      //  System.out.print(ch);

        Pizza pizza = null;
        //pizza.calcCost();

        // System.out.println(50/0);//un-checked exception
        System.out.println("Hello World");

        System.out.println("---------------------------------");

        int score = 100;

        if(score > 59){
            System.out.println("Your grade is D");
        }else if(score > 70){
            System.out.println("Your grade is C");
        }

        System.out.println("---------------------------------");

        // FileInputStream file = new FileInputStream(""); //Checked Exception

        //  Thread.sleep(3000); // Checked exception



    }
}
