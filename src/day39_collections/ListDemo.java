package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);

        arraylist.remove(0);

        arraylist.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("--------------------------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("----------------------------------------");


        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);
    }
}
