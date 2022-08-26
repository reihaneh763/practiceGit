package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("please enter " + size + " entries: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("please enter the number for rotate left: ");
        int numberOfRotate = scanner.nextInt();

        System.out.println("Array after left rotation: ");
        System.out.println(Arrays.toString(leftRotate(array, numberOfRotate)));
    }
    public static int[] leftRotate(int[] array, int numberOfRotate){
        for(int i = 0; i < (numberOfRotate % array.length); i++){
            int temp = array[0];
            int j;
            for(j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[j] = temp;
        }
        return array;
    }
}
