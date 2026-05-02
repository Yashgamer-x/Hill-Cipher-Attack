package com.yashgamerx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yashgamerx.HillCipher;

import java.util.Arrays;

public class HillCipherTest {

    @Test
    public void testHillCipher2X2Matrix(){
        int[] plaintText = {5,4};
        int[][] key = {
                {5 , 8},
                {17, 3}
        };

        var encrypted = HillCipher.encrypt(plaintText, key);
        System.out.println("Encrypted text: "+Arrays.toString(encrypted));

        var decrypted = HillCipher.decrypt(encrypted, key);
        System.out.println("Decrypted text: "+Arrays.toString(decrypted));

        Assertions.assertArrayEquals(plaintText, decrypted);
    }
}
