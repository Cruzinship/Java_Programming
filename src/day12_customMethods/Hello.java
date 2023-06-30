package day12_customMethods;

public class Hello {
    public static void Hello(String FirstName, String LastName) {
        System.out.println("Hello " + FirstName + LastName);
        System.out.println("Hello have a nice day");
    }

    public static void main(String[] args) {
        Hello("Bro ","Code");
        Hello("Gianpaulo ","Cruz");
        Hello("Lena ","Loustarinen");
    }
}
