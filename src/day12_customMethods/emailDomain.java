package day12_customMethods;

public class emailDomain {
    public static void main(String[] args) {
        emailDomain();

    }
    public static void emailDomain() {
        String email = "Cydeo@gmail.com";
        String gmail = email.substring(6, email.indexOf("."));
        System.out.println("domain: " + gmail);
    }
}

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail


 */