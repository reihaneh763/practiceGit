package GroupPractice;

import java.util.Arrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{12, 14, 16, 18},
                {20, 22, 24, 26}};
        int[][] matrix2 = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
            System.out.println(Arrays.deepToString(sumOfMatrix(matrix1, matrix2)));

    }

    public static int[][] sumOfMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
