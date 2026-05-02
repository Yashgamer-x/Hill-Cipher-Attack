package org.yashgamerx;

public class MatrixCalculator {

    public static int[][] moddedScalarMultiplication(
            int[][] matrix,
            int scalar,
            int mod
    ){
        var newMatrix = new int[matrix.length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                newMatrix[i][j] = (matrix[i][j]*scalar) % mod;
            }
        }

        return newMatrix;
    }

    public static int[][] adjunct(int[][] matrix){
        var newMatrix = new int[matrix.length][matrix.length];
        newMatrix[0][0] = matrix[1][1];
        newMatrix[1][1] = matrix[0][0];
        newMatrix[0][1] = ((-matrix[0][1]) % 26) + 26;
        newMatrix[1][0] = ((-matrix[1][0]) % 26) + 26;
        return newMatrix;
    }

    public static int[] moddedMultiplication(
            int[] vector,
            int[][] matrix,
            int mod)
    {
        var result = new int[2];

        result[0] = (matrix[0][0] * vector[0] +
                matrix[0][1] * vector[1]) % mod;

        result[1] = (matrix[1][0] * vector[0] +
                matrix[1][1] * vector[1]) % mod;

        return result;
    }

    public static int[][] moddedInverseMatrix(int[][] matrix){
        var det = DeterminantCalculator.determinant(matrix);
        var moddedDeterminant = ModCalculator.calculate(det, 26);
        var inverseModdedDeterminant = ModCalculator.modInverse(moddedDeterminant, 26);
        var adjunctKeyMatrix = MatrixCalculator.adjunct(matrix);
        return MatrixCalculator.moddedScalarMultiplication(adjunctKeyMatrix, inverseModdedDeterminant, 26);
    }
}
