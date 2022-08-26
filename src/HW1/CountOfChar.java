package HW1;

import java.util.Scanner;

public class CountOfChar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();
        int len = str.length();
        int counter[] = new int[256];
        for (int i = 0; i < len; i++)
            counter[(int) str.charAt(i)]++;
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0)
                System.out.println((char) i + ":" + counter[i]);
        }
    }
}
