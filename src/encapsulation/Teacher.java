package encapsulation;

public class Teacher {

    private int id;
    private String name;
    private String email;
    private String qualification;
    private double salary;

    // getters : used to get/fetch the data
    // setters : used to set/assign the data

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // converting the object into the readable string format
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
                '}';
    }

}
