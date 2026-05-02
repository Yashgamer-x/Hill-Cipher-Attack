package com.yashgamerx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yashgamerx.MatrixCalculator;

public class MatrixTest {

    @Test
    public void matrixLengthTest(){
        int[][] matrix = {{1,2},{1,2}};
        assertEquals(2, matrix.length);
        assertEquals(2, matrix[0].length);
    }

    @Test
    public void testAdjunct(){
        int[][] matrix = {
                {5 , 8},
                {17, 3}
        };

        int[][] expectedMatrix = {
                {3, 18},
                {9, 5}
        };

        var inverseMatrix = MatrixCalculator.adjunct(matrix);
        Assertions.assertArrayEquals(expectedMatrix, inverseMatrix);
    }

    @Test
    public void testModdedInverseMatrix1(){
        int[][] matrix = {
                {5 , 8},
                {17, 3}
        };
        int[][] expectedMatrix = {
                {9, 2},
                {1, 15}
        };

        var inverseMatrix = MatrixCalculator.moddedInverseMatrix( matrix);
        Assertions.assertArrayEquals(expectedMatrix, inverseMatrix);
    }

    @Test
    public void testModdedInverseMatrix2(){
        int[][] matrix = {
                {9, 2},
                {1, 15}
        };
        int[][] expectedMatrix = {
                {5 , 8},
                {17, 3}
        };

        var inverseMatrix = MatrixCalculator.moddedInverseMatrix( matrix);
        Assertions.assertArrayEquals(expectedMatrix, inverseMatrix);
    }

}
