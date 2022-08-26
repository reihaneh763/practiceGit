package Practice_1401_05_13_Part2;

import java.util.Arrays;

public class ShiftRightElementInArray {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8};
        int temp = array[array.length - 1];
        int shift_number = 1;
        for (int i = (array.length - 2); i >= 0; i--) {
            array[i + 1] = array[(i)];
        }
        array[0] = temp;
        System.out.print(Arrays.toString(array));
    }

}
