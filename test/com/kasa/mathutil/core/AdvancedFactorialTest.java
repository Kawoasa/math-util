
package com.kasa.mathutil.core;

import static com.kasa.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //tách toàn bộ data cần test gồm đầu vào/input và expected/output
    //ra 1 chỗ để dẽ quản lý/dễ theo dõi/dễ thống kê đủ các tình huống
    //cần test hay chưa
    //về mặt lý thuyết ta có thể đặt toàn bộ data này ở file txt, csv, excel, database
    @Parameters
    public static Object[][] initData() { //tên hàm tự do
        return new Integer[][] {
                                //7 tình huống xử lý hàm
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720}
                               };
    }
    
    //chuẩn bị 2 biến để hứng data từ mảng, sau đó thảy vào hàm
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenCorrectArumentReturnsWell() {
        
        assertEquals(expected, getFactorial(input));
    }
    
}
