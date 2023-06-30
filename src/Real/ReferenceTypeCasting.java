package Real;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReferenceTypeCasting {

    //Topic 23 Reference Type Casting: There must be inheritance
    //upCasting: smaller reference type to larger reference type
    //downCasting: larger reference type to smaller reference type

    //WebDriver driver = new FireFoxDriver();
    //((TakeScreenShot)driver).takeScreenShot()
    //((JavaScriptExecutor)driver).executeScript()
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ((LinkedList<Integer>) list).pop(); //Pop method removes the first element
        ((LinkedList<Integer>) list).pop(); //Prime example of downCasting my list to a LinkedList to get a specific method
        ((LinkedList<Integer>) list).pop();//This is used in-case we need methods from certain reference types
        ((LinkedList<Integer>) list).pop();
        System.out.println(list);


    }
}
