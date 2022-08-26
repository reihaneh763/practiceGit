package Practice_1401_05_28.Question3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1234);
        employee.setFirstName("reihaneh");
        employee.setLastName("mahjour");
        employee.setBase_salary(12000000);
        CalculateSalary salary = new CalculateSalary();
        System.out.println(salary.calculateSalary(12000000));
    }
}
