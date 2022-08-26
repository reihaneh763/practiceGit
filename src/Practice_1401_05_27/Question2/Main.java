package Practice_1401_05_27.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("Please Enter your first teacherId, firstName, lastName and workHour: ");
        teacher.setTeacherNumber(scanner.nextInt());
        teacher.setFirstName(scanner.next());
        teacher.setLastName(scanner.next());
        teacher.setWorkHour(scanner.nextDouble());

        System.out.println("salary is " + teacher.getSalary());
    }
}
