package day28_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isBlank() || name.isEmpty()) {
            System.err.println("Name cannot be blank or empty");
            System.exit(1);
        }

        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Name must start with letter");
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
            if (!Character.isDigit(each) && !Character.isLetter(each) && each != ' ') {
                System.err.println("Name cannot contain special chars except space");
                System.exit(1);
            }
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice < 0) {
            System.err.println("unit price cannot be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            System.err.println("Quantity cannot be negative");
            System.exit(1);
        }
        if (name.equalsIgnoreCase("toilet paper") && (quantity > 1)) {
            System.err.println("The quantity for toilet paper can not be more than 1");
            return;
        }
        this.quantity = quantity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }
}
/*

4. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */