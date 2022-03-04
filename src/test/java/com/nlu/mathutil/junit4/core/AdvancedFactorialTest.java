package com.nlu.mathutil.junit4.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class) // tham số hóa
public class AdvancedFactorialTest {
    // quy ước phải là public và non static (vì mỗi lần chạy data khác nhau ko thể là static dc)
    @Parameterized.Parameter(value = 0) // do nó là 1 bộ nên parameter còn dưới là nhiều bộ nên parameter có s
    public int input;
    @Parameterized.Parameter(value = 1) // do mảng 2 chiều nên 1 thằng cột 0 và 1
    public long expected;

    // bộ data chuẩn bị sẵn
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{{0, 1}, {1, 1}, {3, 6}, {5, 120}};
    }

    MathUtilDemo factorial = new MathUtilDemo();

    @Test // nó sẽ tự loop qua init
    public void testFactorial() {
        assertEquals(expected, factorial.getFactorial(input));
    }
}

