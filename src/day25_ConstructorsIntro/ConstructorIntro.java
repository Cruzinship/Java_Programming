package day25_ConstructorsIntro;

public class ConstructorIntro {

    public ConstructorIntro() {
        System.out.println("Object is created by using default constructor");
    }

public ConstructorIntro(int a){
            System.out.println("Object is created by using default constructor");
        }
        public void add(){

        }
        public static void main(String[] args){
          ConstructorIntro obj = new ConstructorIntro(10);

            ConstructorIntro obj2 = new ConstructorIntro();


            //ConstructorIntro obj3 = new ConstructorIntro("Java");

        }
    }

