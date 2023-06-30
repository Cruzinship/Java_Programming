package utilities;

public class Library {
    public static void sleep(double seconds){
        try {
            Thread.sleep( (long)(seconds * 1000L) );//multiplying miliSeconds by 1000 to get seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
