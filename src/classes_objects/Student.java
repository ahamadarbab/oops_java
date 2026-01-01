package classes_objects;

public class Student {

    public int id;
    public String name;
    public String dob;
    public String email;
    public String grade;

    // default constructor -> this is automatically created whenever a class is created, if we add it manually class will not create it
    public Student() {
    }

    // parameterized constructor
    public Student(int id, String name, String dob, String email, String grade) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.grade = grade;
    }

    // it converts object into string format
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
