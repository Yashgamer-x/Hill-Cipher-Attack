package org.yashgamerx;

import lombok.extern.java.Log;

@Log
public class HillCipher {

    public static int[] encrypt(int[] plainText, int[][] key){
        return MatrixCalculator.moddedMultiplication(plainText, key, 26);
    }

    public static int[] decrypt(int[] cipherMatrix, int[][] key) {
        var det = DeterminantCalculator.determinant(key);
        var moddedDeterminant = ModCalculator.calculate(det, 26);
        var inverseModdedDeterminant = ModCalculator.modInverse(moddedDeterminant, 26);
        var adjunctKeyMatrix = MatrixCalculator.adjunct(key);
        var inverseKeyMatrix = MatrixCalculator.moddedScalarMultiplication(adjunctKeyMatrix, inverseModdedDeterminant, 26);
        return MatrixCalculator.moddedMultiplication(cipherMatrix, inverseKeyMatrix, 26);
    }

}
