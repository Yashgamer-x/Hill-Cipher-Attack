package org.yashgamerx;

import lombok.extern.java.Log;

@Log
public class HillCipher {

    public static void encrypt(int[][] matrix){
        var determinant = DeterminantCalculator.determinant(matrix);
        var moddedDeterminant = ModCalculator.calculate(determinant, 26);

    }

    public static void decrypt(int[][] matrix){

    }

}
