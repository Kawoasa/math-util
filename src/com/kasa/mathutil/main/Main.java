
package com.kasa.mathutil.main;

import com.kasa.mathutil.core.MathUtil;


public class Main {
    
    public static void main(String[] args) {
        //test = tay, manual testing
        //MathUtil.getFactorial(5);
        System.out.println("0!: 1? " + MathUtil.getFactorial(0));
        System.out.println("1!: 1? " + MathUtil.getFactorial(1));
        System.out.println("2!: 2? " + MathUtil.getFactorial(2));
        System.out.println("5!: 120? " + MathUtil.getFactorial(5));
        System.out.println("6!: 720? " + MathUtil.getFactorial(6));
        //muốn thấy xh ngoại lệ hay ko thì cứ gọi để xem app bị giết
    }
}
