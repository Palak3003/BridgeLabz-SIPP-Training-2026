public class MatrixAdvancedOperations {

    public static int determinant(
            int[][] matrix) {

        return matrix[0][0]
                * matrix[1][1]
                -
                matrix[0][1]
                        * matrix[1][0];
    }

    public static double[][] inverse(
            int[][] matrix) {

        int det =
                determinant(matrix);

        if(det == 0)
            return null;

        double[][] inv =
                new double[2][2];

        inv[0][0] =
                matrix[1][1]
                        / (double)det;

        inv[0][1] =
                -matrix[0][1]
                        / (double)det;

        inv[1][0] =
                -matrix[1][0]
                        / (double)det;

        inv[1][1] =
                matrix[0][0]
                        / (double)det;

        return inv;
    }

    public static void main(
            String[] args) {

        int[][] matrix = {
                {4,7},
                {2,6}
        };

        System.out.println(
                "Determinant = "
                        + determinant(
                        matrix));

        double[][] inv =
                inverse(matrix);

        if(inv != null) {

            System.out.println(
                    "Inverse Matrix");

            for(double[] row : inv) {

                for(double value : row) {

                    System.out.printf(
                            "%.2f ",
                            value);
                }

                System.out.println();
            }
        }
    }
}