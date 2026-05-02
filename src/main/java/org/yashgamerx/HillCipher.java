package org.yashgamerx;

import lombok.extern.java.Log;

@Log
public class HillCipher {

    /// Encrypts the plainText into cipherText
    /// @param plainText A 2x1 matrix
    /// e.g. ```java
    /// int[] plainText = {4, 7}
    /// ```
    /// @param key A 2x2 matrix.
    /// e.g. ```java
    /// int[][] key = {
    ///     {1, 2},
    ///     {3, 4}
    /// };
    /// ```
    /// @return CipherText.
    /// e.g. ```java
    /// int[] cipherText = {2, 1}
    /// ```
    public static int[] encrypt(int[] plainText, int[][] key){
        return MatrixCalculator.moddedMultiplication(plainText, key, 26);
    }

    /// Decrypts the cipherText into plainText
    /// @param cipherMatrix A 2x1 matrix
    /// e.g. ```java
    /// int[] cipherMatrix = {2, 1}
    /// ```
    /// @param key A 2x2 matrix.
    /// e.g. ```java
    /// int[][] key = {
    ///     {1, 2},
    ///     {3, 4}
    /// };
    /// ```
    /// @return decipheredText.
    /// e.g. ```java
    /// int[] decipheredText = {4, 7}
    /// ```
    public static int[] decrypt(int[] cipherMatrix, int[][] key) {
        var inverseKeyMatrix = MatrixCalculator.moddedInverseMatrix(key);
        return MatrixCalculator.moddedMultiplication(cipherMatrix, inverseKeyMatrix, 26);
    }

}
