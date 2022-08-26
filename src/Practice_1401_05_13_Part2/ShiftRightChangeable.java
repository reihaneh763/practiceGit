package Practice_1401_05_13_Part2;

import java.util.Arrays;

public class ShiftRightChangeable {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8, 10};
        int shiftNumber = 3;
        int[] temp = new int[shiftNumber];
        for (int i = array.length-1, j = temp.length-1; i >= (array.length-shiftNumber) & j >=0; i--, j--)
            temp[j] = array[i];
        for (int i = ((array.length - shiftNumber)-1); i >= 0; i--) {
            array[i + shiftNumber] = array[(i)];
        }
        for (int k = 0; k < temp.length; k++ )
            array[k] = temp[k];
        System.out.print(Arrays.toString(array));
    }
}
