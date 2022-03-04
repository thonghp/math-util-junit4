package com.nlu.mathutil.junit4.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilDemoTest {

    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        long expert = 120;
        long actual = MathUtilDemo.getFactorial(5);
        assertEquals(expert, actual); // xanh
//        assertEquals(120, MathUtilDemo.getFactorial(4)); // đỏ
    }

    // kiểm tra xem có ngoại lệ này được ném không
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        MathUtilDemo.getFactorial(-5);
    }
}