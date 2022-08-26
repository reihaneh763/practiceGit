package Practice_1401_05_13_Part2;

public class SortAscending {
    public static void main(String[] args)
    {
        int[] array = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                int tmp = 0;
                if (array[i] > array[j])
                {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
