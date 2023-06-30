package day08_ternaries_switch;

public class CydeoBatches {
    public static void main(String[] args) {

        String batchType = "Us Morning";

        if (batchType == "Us Morning") {
            System.out.println(" Class times are 10-5 EST. M, T, Th, F.");
        } else if (batchType == "Us Evening") {
            System.out.println("Class times are 7-10 EST. M, T, Th, F, S , S.");
        } else if (batchType == "Eu") {
            System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
        } else {
            System.out.println("Invalid batch");


        }
        System.out.println("----------------------");

        String batchType2 = "B";

        switch(batchType2){
            case "A":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "B":
                System.out.println("Class times are 7-10 EST. M, T, Th, F, S , S.");
                break;
            case "C":
                System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
                break;

            default:
                System.out.println("Invalid batch");
        }
        System.out.println("--------------------");

        String batchType3 = "US evening";
        String batchInfo = "";



        if (batchType3 == "EU" || batchType3 == "US morning" || batchType == "US evening"){
            switch (batchType3){
                case "US morning":
                    batchInfo = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    batchInfo = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    batchInfo = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }
        }else {
            batchInfo = "Invalid Batch";
        }
        System.out.println(batchInfo);
    }
}
