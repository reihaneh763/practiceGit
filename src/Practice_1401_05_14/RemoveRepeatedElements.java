package Practice_1401_05_14;

import java.util.Arrays;

public class RemoveRepeatedElements {
    public static int[] removeRepeated(int array[], int sizeOfArray) {
        if (sizeOfArray == 0 || sizeOfArray == 1) {
            return array;
        }
        int[] temp = new int[sizeOfArray];
        int j = 0;
        for (int i = 0; i < sizeOfArray - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        }
        temp[j++] = array[sizeOfArray - 1];
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
        int sizeOfArray = array.length;
        System.out.print(Arrays.toString(removeRepeated(array, sizeOfArray)));
    }
}
