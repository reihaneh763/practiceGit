package Practice_1401_05_27.Question2;

public class Teacher {
    private final double payPerHour = 200;
    private long teacherNumber;
    private String firstName;
    private String lastName;
    private double workHour;

    public double getPayPerHour() {
        return payPerHour;
    }

    public long getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(long teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    public double getSalary(){
        return workHour * payPerHour;
    }
}
