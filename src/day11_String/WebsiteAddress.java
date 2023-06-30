package day11_String;

public class WebsiteAddress {
    public static void main(String[] args) {
String website = "www.newegg.gov";

boolean www1 = website.startsWith("www.");
boolean iscom = website.endsWith(".com");
boolean isgov = website.endsWith(".gov");
boolean isedu = website.endsWith(".edu");
        System.out.println(isgov && www1 );

    }
}

/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

 */
