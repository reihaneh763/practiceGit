package HW2;

import java.util.Scanner;

public class VolumeOfWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of entries: ");
        int numberOfEntries = scanner.nextInt();
        int[] arrayOfEntries = new int[numberOfEntries];
        System.out.println("please enter " + numberOfEntries + " entries: ");
        for (int i = 0; i < numberOfEntries; i++) {
            arrayOfEntries[i] = scanner.nextInt();
        }
        System.out.println("the volume of water is: "+ volumeOfWater(arrayOfEntries, numberOfEntries));
    }
    public static int volumeOfWater(int[] array, int size){
        int volume = 0;
        for (int i = 1; i < size - 1; i++) {
            int leftSide = array[i];
            for (int j = 0; j < i; j++) {
                leftSide = Math.max(leftSide, array[j]);
            }
            int rightSide = array[i];
            for (int j = i + 1; j < size; j++) {
                rightSide = Math.max(rightSide, array[j]);
            }
            volume += Math.min(leftSide, rightSide) - array[i];
        }
        return volume;
    }
}
