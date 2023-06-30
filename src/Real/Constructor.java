package Real;

public class Constructor {
    //CONSTRUCTOR(Topic 11)
    //used when we create objects from the class
    //execution depends on object
        /*
        BasePage:

        public BasePage(){
        PageFactory.initElement(driver, this){}
        @FindBy
        HomePage extends BasePage
        SecondPage extends BasePage
         */
        /*
        Driver:
        private Driver(){
       }
       static WebDriver;
       getDriver(){}
         */

    //AM className(parameter){codes}
    int C;
    String str5;

    public Constructor(int C) {
        this.C = C;
    }

    public Constructor(int C, String str5) {
        this(C);
        this.str5 = str5;

        //super();
        //super.clone();
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(15, "Stroke");
        System.out.println(obj.C);
        System.out.println(obj.str5);

        Constructor obj2 = new Constructor(10);
        System.out.println(obj2.str5);
        System.out.println(obj2.C);

        //NotesForAnInterview.main(new String[]{"Java"}); Main methods can be called but are not meant to be
    }
}