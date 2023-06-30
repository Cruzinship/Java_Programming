package day37_exception;

import day35_polymorhphism.transportationTask.Car;


public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive();//NullPointerExceptions
        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e ){
            System.out.println("Second catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        /*
        try{
        }catch (RuntimeException e){
        }try{
        }try{
        }try{
        }
   */

    }

}
