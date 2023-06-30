package Real;

public class Strings {
    public static void main(String[] args) {
        //STRINGS(Covers Topic 4 and 5)
        //String is Immutable and this is the one we use
        //StringBuilder exist but isn't as fast as String, but is mutable
        //StringBuffer exist but isn't as fast as String, but is mutable

        //Two ways to make a String
//Generally we used String Literal due to how it's faster to right and saves memory
        String str = new String("HelloPlanet"); //This String is stored within Heap
        String str4 = new String("HelloPlanet"); //Heap
        System.out.println(str == str4);//returns false
        String str2 = "HelloWorld"; //goes into special memory allocation known as String pool
        String str3 = "HelloWorld"; //String pool
        System.out.println(str2 == str3);//returns true

        String s = "Cydeo"; //When you do re-assign garbage collection will come and collect the old value to save memory
        s = s.concat(" School"); //This modification has no impact due to the fact that this String is immutable. You need to re-assign it to change it
        System.out.println("s = " + s);

        StringBuilder stringBuilder = new StringBuilder("Cydeo");
        stringBuilder.append(" School");// Due to this type of string being mutable it is easy to modify string
        System.out.println(stringBuilder);
        //StringBuffer is best for Synchronization and for it is also mutable
    }
}