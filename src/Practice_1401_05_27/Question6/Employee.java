package Practice_1401_05_27.Question6;

import java.util.Objects;

public class Employee {
    private final double RAISE_ONE = 0.3;
    private final double RAISE_TWO = 0.4;
    private final double RAISE_THREE = 0.5;
    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public double getSalary() {
        raiseSalary();
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void raiseSalary() {
        if (salary >= 2e+6 && salary < 3e+6)
            salary = salary * RAISE_ONE + salary;
        else if (salary >= 3e+6 && salary < 6e+6)
            salary = salary * RAISE_TWO + salary;
        else if (salary >= 6e+6)
            salary = salary * RAISE_THREE + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName);
    }
}
