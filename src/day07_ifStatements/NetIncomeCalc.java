package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 100000;

        double taxRate = 0;
        boolean isMarried = false;

        if(salary >= 130000) {
            taxRate = 0.35;
        }
        if(salary >= 100000 && salary < 129000) {
            taxRate = 0.3;
        }
        if(salary >= 80000 && salary < 99999) {
            taxRate = 0.25;
        }
        if(salary < 80000) {
            taxRate = 0.2;
        }
        if (isMarried){
            taxRate -= 0.05; // if true will reduce tax by 5%
        }

        double totalTax = salary * taxRate;
        double netIncome = salary * (1-taxRate);

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }
}

/*
create a class named NetIncome. Write a program that can calaculate the salary aftertax based on the following requirements
the tax rates are:
35% for salary of 130k or more
30% for salary of 100k or 128k
25% for salary of 80k or 99k
20% for a salary of 70  or less
reminder:
if the person is married they will pay 5% less
 */
