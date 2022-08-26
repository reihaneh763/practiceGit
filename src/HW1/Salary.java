package HW1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter yor salary: ");
        int salary = scanner.nextInt();
        //float tax = 0;
        if (salary < 3000000) {
            //tax = salary * 0.05f;
            salary *= 0.95;
        }
        else if (salary >= 3000000 && salary < 6000000)
            salary *= 0.9;
        else
            salary *= 0.76;
        System.out.println(salary);
    }
}
