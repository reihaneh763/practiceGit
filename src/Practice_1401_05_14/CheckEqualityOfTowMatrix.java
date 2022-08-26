package Practice_1401_05_14;

public class CheckEqualityOfTowMatrix {
    public static void main(String[] args) {

        int matrix1[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}};

        int matrix2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        //int matrix2[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}};

        if (checkEquality(matrix1, matrix2))
            System.out.println("2 Matrix are equal");
        else
            System.out.println("2 Matrix are not equal");
    }
    public static boolean checkEquality(int[][] matrix1, int[][] matrix2){
        boolean flag = true;
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            flag = false;
        } else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}
