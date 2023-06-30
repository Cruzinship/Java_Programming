package day28_encapsulation;

import java.sql.SQLOutput;

public class Circle {
    private double radius;
    public static double pi = 3.14;

    static{                                 // Create static block to initialize static variable pi
        pi = 3.14;
    }

    public double getRadius() {             // Getter for calling radius. If radius is calling a default value,..
        if(radius == 0){                    // it has not been set and is unknown.
            System.err.println("Radius is unknown");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(double radius) {  // Setter for setting radius. Radius cannot be zero or neg
        if(radius <= 0){
            System.err.println("Radius invalid. Radius cannot be zero or negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {          // Constructor to set radius at object creation- using...
        setRadius(radius);                  // setMethod to keep restrictions in place.
    }


    public double calcArea(){               // public return method to calculate Area. Access the private instance...
        return pi * getRadius() * getRadius(); // variable through the getMethod to keep restrictions intact
    }

    public double calcPerimeter(){          // public return method to calculate Perimeter. Access the private instance...
        return 2 * pi * getRadius();        // variable through the getMethod to keep restrictions intact
    }

    public String toString() {              // public return method for toString. Access the private instance...
        return "Circle {" +                 // variable through the getMethod to keep restrictions intact
                "radius=" + getRadius() +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
1. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement


 */