package day12_customMethods;

public class monthCap {
    public static void main(String[] args) {


        monthName("January");

    }

    public static void monthName(String month){
        String result = "";
        if(month.equals("April")){
            result = "30";
        }else if(month.equals("June")){
            result = "30";
        }else if(month.equals("September")){
            result = "30";
        }else if (month.equals("November")){
            result = "30";
        }else if(month.equals("February")){
            result = "28";
        }else if(month.equals("January")){
            result = "31";
        }else if(month.equals( "August")){
            result = "31";
        }else if(month.equals("March")){
            result = "31";
        }else if(month.equals("October")){
            result = "31";
        }else if(month.equals("December")){
            result = "31";
        }else if(month.equals("May")){
            result = "31";
        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}
