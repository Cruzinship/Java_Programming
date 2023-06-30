package Real;

import day28_encapsulation.Item;

class item{

    private String name;
    private double price;

    public String getName(){
        if (name == null || name.equalsIgnoreCase("unknown")){
            throw new RuntimeException("Invalid name: " + name);
        }
        return name;
    }
    public void setName(String name){
        if (name.trim().isEmpty()){
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class OOPEncapsulations {
    //topic(16)
    //hiding the data by declaring them private.
    //use the public getter and setter to read/write the data
    /*
    Getter: Read ONLY
    Returns the value of the private instance variable
    0 parameters

    Setter: Write ONLY
    does not return any value
    1 parameter
     */

    public static void main(String[] args) {
       item item = new item();
       item.setName("Pan");
       item.setPrice(1);

        System.out.println(item.getName());
        System.out.println(item.getPrice());
    }
}
