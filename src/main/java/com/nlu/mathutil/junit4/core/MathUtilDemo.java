package com.nlu.mathutil.junit4.core;

public class MathUtilDemo {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("invalid");
        if (n == 1 || n == 0) return 1;
        return n * getFactorial(n - 1);
    }
}
