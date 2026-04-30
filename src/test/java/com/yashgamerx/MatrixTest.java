package com.yashgamerx;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    @Test
    public void matrixLengthTest(){
        int[][] matrix = {{1,2},{1,2}};
        assertEquals(2, matrix.length);
        assertEquals(2, matrix[0].length);
    }

}
