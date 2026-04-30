package org.yashgamerx;

import lombok.extern.java.Log;

@Log
public class HillCipher {

    public static int[][] encrypt(int[][] matrix){
        var determinant = DeterminantCalculator.determinant(matrix);
        var moddedDeterminant = ModCalculator.calculate(determinant, 26);
        var inverseModdedDeterminant = ModCalculator.modInverse(moddedDeterminant,26);
        return MatrixCalculator.moddedScalarMultiplication(matrix, inverseModdedDeterminant, 26);
    }

    public static void decrypt(int[][] matrix){

    }

}
