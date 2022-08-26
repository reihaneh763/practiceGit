package Practice_1401_05_14;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter size of your array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("please enter elements of your array: ");
        for (int i = 0; i < arraySize; i++)
            array[i] = sc.nextInt();
        Arrays.sort(array);
        System.out.println("What is the maximum number you need? ");
        int largestIndex = sc.nextInt();
        System.out.println(array[arraySize - largestIndex]);
    }
}