package Real;

public class WrapperClass {
    public static void main(String[] args) {
        //WRAPPER CLASSES!!!(Topic 3)
        //Wrapper Class is used to convert Java dataTypes to Objects
        //Naturally the dataTypes in java are not objects
        //JAVA DATATYPE TO WRAPPER CLASS OBJECT EXAMPLE
        //First make the objects and then make them into Objects. Similar to Casting But we will be using value Of(Variable) to aid us
        int a = 5;
        double b = 5.65;

        Integer objectA = Integer.valueOf(a);
        Double objectB = Double.valueOf(b);

        if (objectA instanceof Integer) {
            System.out.println("An object of Integer is created");
        }
        if (objectB instanceof Double) {
            System.out.println("An object of Double is created");
        }

        //WRAPPER CLASS OBJECT TO JAVA DATATYPE
        //First we will make our wrapper class objects
        //Then we as easy as it seems make them into Java objects by storing them into out normal DataTypes. Note after variable name use .DoubleValue()
        Integer ObjectA = Integer.valueOf(20);
        Double ObjectB = Double.valueOf(20.5);

        int A = ObjectA.intValue();
        double B = ObjectB.doubleValue();

        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}
