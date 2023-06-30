package day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args){
        int salary = 60000,
                createdScore = 800;

        String result = "";

        if(salary >= 45000 && createdScore >= 700) {
            result = "You are eligible to apply for a loan";
        }else{
            result = "You are not eligible to apply for a loan";
        }
        System.out.println(result);

//making a code to see if a person can apply for a loan using if statements

    }
}
/*
1. Create a class named LoanApplications, two variables named
salary and createdScore and declared and given , write a program that can check
if the person is eligible to apply for a loan
1. salary : at least 45k
2. credit score: at least 700
 */
