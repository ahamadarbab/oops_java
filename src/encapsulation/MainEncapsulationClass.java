package encapsulation;

public class MainEncapsulationClass {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        // assigning values
        teacher1.setId(123);
        teacher1.setName("Ajay");
        teacher1.setEmail("ajay@gmail.com");
        teacher1.setQualification("Msc");
        teacher1.setSalary(30000.00);

        // to print all the data of the teacher
        System.out.println("teacher1 is : " + teacher1);

        // to print particular data of the teacher
        System.out.println("email of the teacher is : " + teacher1.getEmail());
        System.out.println("salary of the teacher is : " + teacher1.getSalary());
    }
}
