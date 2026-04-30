package org.yashgamerx;

public class ModCalculator {
    public static int calculate(int x, int mod){
        return (x%mod)+mod;
    }

    public static int modInverse(int a, int m) {
        int m0 = m, y = 0, x = 1;
        if (m == 1) return 0;
        while (a > 1) {
            if (m == 0) return -1;
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) x += m0;
        return x;
    }
}
