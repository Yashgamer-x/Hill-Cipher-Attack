package com.yashgamerx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yashgamerx.DeterminantCalculator;
import org.yashgamerx.ModCalculator;

public class DeterminantTest {

    @Test
    public void testDeterminant(){
        int[][] matrix ={
                {5, 8},
                {17, 3}
        };
        var determinant = DeterminantCalculator.determinant(matrix);
        Assertions.assertEquals(-121, determinant);
        Assertions.assertEquals(
                9,
                ModCalculator.calculate(determinant, 26)
        );
    }

    @Test
    public void modInverseTester(){
        Assertions.assertEquals(
                3,
                ModCalculator.modInverse(9, 26)
        );
    }
}
