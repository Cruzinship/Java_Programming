package day14_ForLoop;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25);//8
        main(2.85);//c
        main(true); //D
    }
    public static void main(int args){
        System.out.println("B");
    }
    public static void main(double args){
        System.out.println("C");
    }
    public static void main(boolean args){
        System.out.println("D");
    }
}
