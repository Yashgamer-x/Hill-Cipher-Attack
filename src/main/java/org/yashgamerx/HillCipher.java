package org.yashgamerx;

import lombok.extern.java.Log;

@Log
public class HillCipher {

    public static int[] encrypt(int[] plainText, int[][] key){
        return MatrixCalculator.moddedMultiplication(plainText, key, 26);
    }

    public static int[] decrypt(int[] cipherMatrix, int[][] key) {
        var inverseKeyMatrix = MatrixCalculator.moddedInverseMatrix(key);
        return MatrixCalculator.moddedMultiplication(cipherMatrix, inverseKeyMatrix, 26);
    }

}
