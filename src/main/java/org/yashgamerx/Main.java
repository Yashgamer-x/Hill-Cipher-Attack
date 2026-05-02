package org.yashgamerx;


import java.util.Scanner;

class Main {

    static void main() {

        var in = new Scanner(System.in);

        int[][] key = new int[2][2];
        int[] plainText = new int[2];

        System.out.println("Enter 2x2 key matrix (4 integers):");
        key[0][0] = in.nextInt();
        key[0][1] = in.nextInt();
        key[1][0] = in.nextInt();
        key[1][1] = in.nextInt();

        System.out.println("Enter 2x1 plaintext vector (2 integers):");
        plainText[0] = in.nextInt();
        plainText[1] = in.nextInt();

        int[] cipher = HillCipher.encrypt(plainText, key);

        System.out.println("Encrypted (cipher text vector):");
        System.out.println(cipher[0] + " " + cipher[1]);

        int[] decrypted = HillCipher.decrypt(cipher, key);

        System.out.println("Decrypted (plaintext vector):");
        System.out.println(decrypted[0] + " " + decrypted[1]);

        in.close();
    }
}
