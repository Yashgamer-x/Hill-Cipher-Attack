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
}
