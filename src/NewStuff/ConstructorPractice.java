package NewStuff;

import utilities.Test;

public class ConstructorPractice {

    public ConstructorPractice(){
        System.out.println("A ");
    }
    public ConstructorPractice(int a){
        this(2.5);
        System.out.println("B ");
    }
    public ConstructorPractice(double c){
        this();
        System.out.println("C ");
    }

    public static void main(String[] args) {
        ConstructorPractice constructorPractice = new ConstructorPractice(23);

    }
}
