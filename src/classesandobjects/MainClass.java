package classesandobjects;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello everyone");

        // creating object
        Student student1 = new Student();
        System.out.println("student1 before assigning values : " + student1);

        // assigning values
        student1.id = 123;
        student1.name = "Ajay";
        student1.dob = "12/12/2009";
        student1.email = "ajay@gmail.com";
        student1.grade = "10th";

        System.out.println("student1 after assigning values : " + student1);

        // it will create an object and assign values in parameterized constructor
        Student student2 = new Student(234, "Vijay", "08/10/2009", "vijay@gmail.com", "10th");
        System.out.println("student2 after assigning values : " + student2);
    }
}
