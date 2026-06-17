import java.util.Scanner;

public class MatrixOperations {

    public static void print(
            int[][] matrix) {

        for(int[] row : matrix) {

            for(int value : row) {

                System.out.print(
                        value + " ");
            }

            System.out.println();
        }
    }

    public static int[][] add(
            int[][] a,
            int[][] b) {

        int rows = a.length;
        int cols = a[0].length;

        int[][] result =
                new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0;
                j < cols;
                j++) {

                result[i][j] =
                        a[i][j]
                                + b[i][j];
            }
        }

        return result;
    }

    public static int[][] subtract(
            int[][] a,
            int[][] b) {

        int rows = a.length;
        int cols = a[0].length;

        int[][] result =
                new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0;
                j < cols;
                j++) {

                result[i][j] =
                        a[i][j]
                                - b[i][j];
            }
        }

        return result;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int[][] a = {
                {1,2},
                {3,4}
        };

        int[][] b = {
                {5,6},
                {7,8}
        };

        System.out.println(
                "Addition");

        print(add(a,b));

        System.out.println(
                "Subtraction");

        print(subtract(a,b));
    }
}