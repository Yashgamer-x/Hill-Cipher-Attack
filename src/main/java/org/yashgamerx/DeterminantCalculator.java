package org.yashgamerx;

import lombok.extern.java.Log;

import java.util.Arrays;

@Log
public class DeterminantCalculator {

    public int determinant(int[][] matrix){
        if(!(matrix.length == 2 &&
                matrix[0].length == 2 &&
                matrix[1].length == 2)){
            log.severe("The matrix is: "+Arrays.toString(matrix));
            throw new ArithmeticException("Matrix is not 2x2");
        }

        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
}
