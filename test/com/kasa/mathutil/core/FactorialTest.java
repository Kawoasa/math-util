/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kasa.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class FactorialTest {
    
    @Test //viết code dùng để test code chính MathUtil
    //      tên hàm phải nói lên mục đích của việc test
    public void checkFactorialGivenCorrectArumentReturnsWell() {
        //tui kì vọng khi gọi hàm tính 5! thì mày trả về 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        
        //đừng quên còn nhiều tình huống xài hàm
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    //biến hàm này thành public static void main() {...}
    //      đây là cú pháp/quy tắc của bộ thư viện JUnit
    public void checkFactorialGivenWrongArumentThowsException() {
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21);
        MathUtil.getFactorial(22);
        
    }
    //âm ko tính giai thừa
    //>= 21! bị tràn long, ko tính luôn
    //2 tình huống này ko có value trả về, ko so sánh dc
    //ko assertEquals() so sánh coi bằng ko
    
    //XANH ĐỎ QUY ƯỚC
    //HÀM ĐÁNH GIÁ LÀ XANH, NẾU TẤT CẢ CÁC TÌNH HUỐNG TEST PHẢI XANH
    //TEST GÌ THÌ XANH NÀY, TỨC LÀ TEST GÌ, THÌ EXPECTED == ACTUAL
    //ÁM CHỈ HÀM XỬ LÝ ĐÚNG
    
    //CHỈ CẦN 1 CÁI ĐỎ, CẶP EXPECTED != ACTUAL, CÓ NGHĨA HÀM XỬ LÝ KO ĐÚNG
    //HOẶC BẠN KÌ VỌNG XAI
    
    //TA CẦN XEM LẠI CODE/TEST ĐỂ ĐẢM BẢO XANH HẾT, KẾT LUẬN HÀM ỔN
    //CHO CÁC TÌNH HUỐNG ĐÃ TEST
}
