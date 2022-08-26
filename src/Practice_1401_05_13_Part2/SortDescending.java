package Practice_1401_05_13_Part2;

public class SortDescending {
    public static void main(String[] args) {
        int temp;
        int array[] = {7, 10, 4, 3, 20, 15};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
