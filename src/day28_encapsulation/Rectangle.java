package day28_encapsulation;

public class Rectangle {
    private double width, length;

    public double getWidth(double width) {
        if (width < 0) {
            System.err.println("Mid input");
            System.exit(1);
        }
        return width;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double getLength(double length) {
        if (length < 0) {
            System.err.println("Mid input");
            System.exit(1);
        }
        return length;
    }

    public double setLength(double length) {
        this.length = length;
        return length;
    }

    public double calcArea(){
        double area = length * width;
        return area;
        }
        public double calcPerimeter(){
        double perimeter = length + length + width + width;
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
3. Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */