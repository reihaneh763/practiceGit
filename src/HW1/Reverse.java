package HW1;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number:");
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number / 10;
        }
        System.out.print("Reverse Number:" + reverse);
    }
}
