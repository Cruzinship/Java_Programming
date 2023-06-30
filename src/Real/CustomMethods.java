package Real;

public class CustomMethods {
    //CUSTOM METHODS(Topic 9)
    //Set of instruction this can perform a task Access Modifier = AM!
    //AM ReturnType MethodName(Parameter){
    //Codes fragments that are needed to perform the desired task
    //}
    //improves the Reusability of our codes
    // you may add a static keyword in between the AM and ReturnType
    //making a method static makes it belong to the class. If there is no static it belongs to the object
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        reverse("Stroke");

        //METHOD OVERLOADING(Topic 10)
        //multiple methods having the same method name
        //To achieve overloading the parameters must be different
        //Happens in the same class
        System.out.println("This was for overloading methods");
    }

}
