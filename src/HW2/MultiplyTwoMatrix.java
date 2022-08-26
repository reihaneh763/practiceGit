package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:");
        int numberOfRowsMatrix1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix:");
        int numberOfColumnMatrix1 = scanner.nextInt();
        System.out.print("Enter the number of rows in the second matrix:");
        int numberOfRowsMatrix2 = scanner.nextInt();
        System.out.print("Enter the number of columns in the second matrix:");
        int numberOfColumnMatrix2 = scanner.nextInt();

        int[][] matrix1 = new int[0][];
        int[][] matrix2 = new int[0][];
        if ((numberOfRowsMatrix1 != numberOfColumnMatrix2) || (numberOfRowsMatrix2 != numberOfColumnMatrix1))
            System.out.println("The multiplication cannot be done");
        else {
            matrix1 = new int[numberOfRowsMatrix1][numberOfColumnMatrix1];
            matrix2 = new int[numberOfRowsMatrix2][numberOfColumnMatrix2];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < numberOfRowsMatrix1; i++) {
                for (int j = 0; j < numberOfColumnMatrix1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < numberOfRowsMatrix2; i++) {
                for (int j = 0; j < numberOfColumnMatrix2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        }

        if (matrix1.length == matrix2[0].length)
            System.out.println(Arrays.deepToString(multiplication(matrix1, matrix2)));
        else
            System.out.println(Arrays.deepToString(multiplication(matrix2, matrix1)));
    }

    public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
