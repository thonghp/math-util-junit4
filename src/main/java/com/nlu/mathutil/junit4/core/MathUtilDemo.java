package com.nlu.mathutil.junit4.core;

public class MathUtilDemo {
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) throw new IllegalArgumentException("invalid");
//        if (n == 1 || n == 0) return 1;
//        return n * getFactorial(n - 1);
//    }

    // sử code để test kiểm thử hồi quy
    public static long getFactorial(int n) {
        if (n < 0 || n >= 21) throw new IllegalArgumentException("invalid");
        if (n == 0 || n == 1) return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
