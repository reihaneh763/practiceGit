package Practice_1401_05_13_Part2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.print("Reverse Array: ");
        for (int i = (array.length - 1); i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}
