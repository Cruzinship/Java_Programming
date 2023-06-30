package day12_customMethods;

public class eligibleToVote {
    public static void main(String[] args) {
        int age;
        boolean isAmerican;
        eligibleToVote(23, true);
    }

    public static void eligibleToVote(int age, boolean isAmerican){
        String result = "";
        if (age >= 23 && isAmerican == true){
            result = "You are eligible to vote";
        }else{
            result = "Not eligible to vote";
        }
        System.out.println(result);
    }
}
