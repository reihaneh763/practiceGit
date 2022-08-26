package Practice_1401_05_27.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Please Enter your userName: ");
        user.setUserName(scanner.next());
        System.out.print("Please Enter your password: ");
        user.setPassword(scanner.nextInt());
        if (isCorrect(user))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");

    }

    public static boolean isCorrect(User user) {
        if (user.getUserName().equals("Maktab"))
            if (user.getPassword() == 1234)
                return true;
        return false;
    }
}
