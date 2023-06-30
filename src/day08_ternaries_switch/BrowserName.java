package day08_ternaries_switch;

public class BrowserName {
    public static void main(String[] args) {
        String browserName = "opera";
        String result = "";

        switch (browserName) {
            case "Chrome":
                result = browserName;
                break;
            case "firefox":
                result = browserName;
                break;
            case "Opera":
                result = browserName;
                break;
            case "Safari":
                result = browserName;
                break;
            case "Edge":
                result = browserName;
            default:
                result = "Invalid Browser";

        }
        System.out.println(result);
    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */