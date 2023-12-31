package day28_encapsulation;


public class Square {

    private double side;

    public double getSide(double side) {
        if (side <= 0) {
            System.err.println("Side of the square cannot be negative");
            System.exit(1);
        }
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calcArea() {
        return side = side * side;
    }

    public double calcPerimeter() {
        return side = side + side + side + side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Square:
        Private variables:
        side

        Encapsulate all the fields

        Condition:
        side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
        calcArea(): returns the area of square
        calcPerimeter(): returns the perimeter of square
        toString(): can display the side, area, perimeter of square when object is passed in print statement
        */
