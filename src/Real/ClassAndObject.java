package Real;

class Spartan{

    public static String name;
    public Spartan(String name){
        this.name = name;
    }
}
public class ClassAndObject {
    //Class & Object:(Topic 12)
    //class is a template/bluePrint of object, where the object came from, determines how the object should be created and how the object should behave
    //Object is the result of the class. it is one instance of the class
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan("Elijah");
        Spartan spartan2 = new Spartan("Gianpaulo");
        Spartan spartan3 = new Spartan("W human"); // When its static it will become the most recent value if not already stated
        System.out.println(spartan1.name);
        System.out.println(spartan2.name);
        System.out.println(spartan3.name);
    }
    //Topic 13
    //Instance: belongs to object. Multiple copies, each object has its own copy
    //Static: belongs to class. one copy, all objects will share same copy


}

