package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {
Employee employee1 = new Employee();
employee1.setInfo("Sumeye", 28, 'F', "Java Operator", 95000, "A12");

Employee employee2 = new Employee();
employee2.setInfo("Khashayar", 29,  'M', "Back-end Developer", 98000, "B13");

Employee employee3 = new Employee();
employee3.setInfo("Abudyllah", 30, 'M', "Front-end Dveloper",99000, "C14");
employee2.age =39;
employee3.name = "Lucy";
employee3.gender = 'F';
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();
    }
}
