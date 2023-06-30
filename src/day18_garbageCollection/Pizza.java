package day18_garbageCollection;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberPepperoniTopping;

    //calculates total price of the pizza, returns it as double
    public double calcCost() {
        double totalPrice = 0;
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberPepperoniTopping);
break;
            default:
                System.err.println("Invalid Size " + size);
        }
        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberPepperoniTopping = numberPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberPepperoniTopping= " + numberPepperoniTopping +
                ", total price = " + calcCost() +
                '}';

    }

}
/*
1. Create a class named Pizza:
        Attributes:
        1. size
        2. numberOfCheeseTopping
        3. numberOfPepperoniTopping
        Actions:
        calcCost(): returns the total cost of the pizza
        toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
        S: $10 + $2 per topping
        M: $12 + $2 per topping
        L: $14 + $2 per topping
        */