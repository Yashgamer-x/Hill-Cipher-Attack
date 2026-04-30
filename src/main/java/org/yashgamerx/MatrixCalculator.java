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
        newMatrix[0][1] = matrix[1][0];
        newMatrix[1][0] = matrix[0][1];
        return newMatrix;
    }

    public static int[] moddedMultiplication(
            int[] matrix1,
            int[][] matrix2,
            int mod)
    {
        var newMatrix = new int[2];
        newMatrix[0] = (matrix2[0][0]*matrix1[0] +
                matrix2[1][0]*matrix1[1]) % mod;
        newMatrix[1] = (matrix2[0][1]*matrix1[0] +
                matrix2[1][1]*matrix1[1]) % mod;
        return newMatrix;
    }
}
