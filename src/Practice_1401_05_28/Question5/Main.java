package Practice_1401_05_28.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter the numbers of students: ");
        int countOfStudent = scanner.nextInt();
        Student[] student = new Student[countOfStudent];
        int id;
        String firstname;
        String lastname;
        for (int i = 0; i < countOfStudent; i++) {
            System.out.println("pleas enter " + i + " student info: ");
            System.out.println("studentId: ");
            id = scanner.nextInt();
            System.out.println("firstname: ");
            firstname = scanner.next();
            System.out.println("lastname: ");
            lastname = scanner.next();
            student[i] = addStudent(id, firstname, lastname);
        }
        System.out.println("______________________________________________");
        System.out.println("pleas enter studentId for find student: ");
        int findId = scanner.nextInt();
        if (findStudent(student, findId)== null)
            System.out.println("not find!");
        else
            System.out.println("The student exists in the system");
        System.out.println("______________________________________________");
        System.out.println("The list of students:");
        showAllStudentsInfo(student);
    }

    public static Student addStudent(int id, String firstname, String lastname) {
        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstname);
        student.setLastName(lastname);
        return student;
    }

    public static Student findStudent(Student[] students, int id) {
        for (int i = 0; i < students.length; i++){
            if(students[i].getId() == id)
                return students[i];
        }
        return null;
    }

    public static void showAllStudentsInfo(Student[] students){
        for (int i = 0; i < students.length; i++){
            System.out.println("student ID: " + students[i].getId());
            System.out.println("firstname: " + students[i].getFirstName());
            System.out.println("lastname: " + students[i].getLastName());
            System.out.println("_______________________");
        }
    }
}
