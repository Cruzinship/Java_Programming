package Real;

public class FinalKeyword {
    //Topic 19
    //variable: can not be re-assigned
    //method: can not be overriden
    //class: can not be inherited
    public static void main(String[] args) {
        final String superman = "Superman";
        //superman = superman.trim().toLowerCase(); cannot edit due to final
        System.out.println(superman);
    }
}
