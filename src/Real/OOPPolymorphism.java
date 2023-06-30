package Real;


import day35_polymorhphism.transportationTask.Audi;
import day35_polymorhphism.transportationTask.Car;
import day35_polymorhphism.transportationTask.Tesla;
import day38_exception.shapeTask.Circle;

import java.util.Arrays;

public class OOPPolymorphism {
    //Topic 22 Polymorphism
    //ability of object to take many forms
    public static void main(String[] args) {
//Car[] cars = {car, car1};
        //WebDriver driver = new ChromeDriver();
        //( (TakesScreenShot)driver ).takeScreenShot()
        Car car = new Audi("Stroke", "Stroke", "White", 2001, 10);
        System.out.println( ((Car) car).getColor());
        System.out.println(car.getMake());
        Car car1 = new Tesla("Stroke", "Stroke", "White", 2000, 10);


    }
}