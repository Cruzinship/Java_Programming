package NewStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        for (int i = 0; i < L; i++){
            list.add(input.nextInt());
        }
        int nOFQueries = input.nextInt();
        for (int i=0; i < nOFQueries; i++){
            String choice = input.next();
            if (choice.equals("Insert")){
                int x = input.nextInt();
                int y = input.nextInt();
                list.add(x,y);
            }
            if (choice.equals("Delete")){
                int x = input.nextInt();
                list.remove(x);
            }
        }
        for (int n: list) {
            System.out.print(n+ " ");
        }

    }
}
