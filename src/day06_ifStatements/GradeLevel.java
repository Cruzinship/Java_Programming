package day06_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 17;

        if(gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("You are in Elementary School");
        }
        if(gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println("You are in Middle School");
        }
        if(gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("You are in High School");
        }
        if(gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("You are in College");
        }
        if(gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("You are in Grad School");
        }

    }
}
