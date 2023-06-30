package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Iphone 12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        System.out.println("--------------------------------------");

        iPhone.printPhoneInfo();

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();




    }
}
