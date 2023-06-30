package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalPractice {
    public static void main(String[] args) {
        String[] group1 = {"James", "Daniel", "Sumeye", "Abidullah"};// 4 names
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"};// 3 names
        String[] group3 = {"Alena", "Evgenia", "Shukur", "Hasan", "Bilal"};// 5 names
        String[] group4 = {"Adelina", "Ali"};//2 names

        String[][] groups = {{"James", "Daniel", "Sumeye", "Abidullah"}, {"Madiyar", "Khashayar", "Rayhane"}, {"Alena", "Evgenia", "Shukur", "Hasan", "Bilal"}, {"Adelina", "Ali"}};


        for (int i = 0; i < groups.length; i++) {
            String[] eachGroups = groups[i];
            System.out.println(Arrays.toString(eachGroups));
            for (int j = 0; j < eachGroups.length; j++) {
                String eachStudent = eachGroups[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("----------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroups2 = groups[i];
            System.out.println(Arrays.toString(eachGroups2));
            for (String eachStudent : eachGroups2) {
                System.out.println(eachStudent);
            }
        }
        System.out.println("-----------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups));
    }
}
