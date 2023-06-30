package day25_ConstructorsIntro;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>( Arrays.asList(dogs) );
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
       /* for (Dog dog : dogs) {
            if (dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);


            }
        }
*/
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age > 4);
        System.out.println(youngDogs);

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
femaleDogs.removeIf(p -> p.gender == 'M');

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println(femaleDogs);
        System.out.println(maleDogs);

        System.out.println("-------------------------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[20]);

        System.out.println(Arrays.toString(dogs2));

    }
}
/*
     1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops
 */