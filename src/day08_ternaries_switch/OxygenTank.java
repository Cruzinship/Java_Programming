package day08_ternaries_switch;

public class OxygenTank {
    public static void main(String[] args) {

            int o2Level = 60;
            String result = "";

            result = (o2Level >= 90 && o2Level <= 100) ? "Your tank is full" : (o2Level >= 80 && o2Level <= 90) ? "Still okay"
                    : (o2Level >= 70 && o2Level <= 80) ? "Don't go too far" : (o2Level >= 60 && o2Level <= 70) ?
                    "Start to head back" : "Be careful now you are at 50%";

            System.out.println(result);

    }
}
