/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kasa.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //ta viết hàm tính giai thừa 
    //21! tràn kiểu long (18 số 0)
    //ko tính đc âm giai thừa
    //0! = 1! = 1 quy ước
    //TDD - Test Driven Development - viết test trước khi viết code chính
    //Test First Development, viết, suy nghĩ, về bộ test case các tình huống
    //chạy hàm trước khi viết hàm
    //Đệ quy, recursion, gọi lại chính mình với quy mô khác
    //Búp bê người Nga
    //n! = n * (n - 1)! công thức lặp lại
    public static long getFactorial(int n) {
        
        if (n < 0 | n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
       
        if (n == 0 | n == 1)
            return 1; //n đặc biệt dừng luôn
        
        return n * getFactorial(n - 1); //xong 
    }
//    public static long getFactorial(int n) {
//        
//        if (n < 0 | n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        
//        if (n == 0 | n == 1)
//            return 1; //n đặc biệt dừng luôn
//        
//        long factorial = 1; //khởi đầu giai thừa bằng 1
//        
//        
//        for (int i = 2; i <= n; i++) 
//            factorial *= i;
//        
//        return factorial;
//    }
    
    
}
