package day12_customMethods;

public class Capitalization {
    public static void main(String[] args) {
        capitalization();

    }
public static void capitalization(){
        String firstName = "CyDeO",
                lastName = "sCHool";
        String firstName1 = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastname1 = lastName.substring(0,1).toUpperCase() +lastName.substring(1).toLowerCase();
    String fullName = firstName1 + " " + lastname1;
    System.out.println(fullName);
    }
}

/*

2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */