package day33_abstration;

import day32FinalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;

    private static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);// Super keyword must always be first
       if (getAge() < 18){//checks if the received age is less than 18 to see if constructor must be exited or not
           System.err.println("Cydeo Developer student must be 18 years old");
           System.exit(1);
        }
        this.id = id;
       setBatchName(batchName);
       setBatchNumber(batchNumber);
    }

   static {
        programmingLanguage = "Java";
   }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        }else{
            System.err.println("Invalid batch name: " + batchName + " \n No such batch name in Cydeo");
            System.exit(1);
        }
    }
    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0 ){
            System.err.println("Inavlid batch number: " + batchNumber + "\n Batch number can not be 0 or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}

/*
Warmup tasks:
	1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */