package com.ll.demo.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author ll
 * @date 2018/7/23 上午12:26
 */
public class SimpleTest {

    public static void main(String[] args) {
//        test(100);
//        test2();
        test3(100);
    }


    private static void test(int rows) {

        for (int i = 0; i < rows; i++) {
            long number = 1;
            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                DecimalFormat format = new DecimalFormat("0.##E0");
                String s = format.format(number);
                System.out.format("%8s", s);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    private static void test3(int rows) {

        for (int i = 0; i < rows; i++) {
            BigDecimal number = new BigDecimal("1");

            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                DecimalFormat format = new DecimalFormat("0.##E0");
                String s = format.format(number);
                System.out.format("%4s", number.toString());
                BigDecimal b1 = new BigDecimal(i - j);
                BigDecimal b2 = new BigDecimal(j+1);
                number = number.multiply(b1);
                number = number.divide(b2);
            }
            System.out.println();
        }
    }


    private static void test2() {
        System.out.println("a"+"\n"+"b");
        System.out.println();
        DecimalFormat format = new DecimalFormat("0.##E0");
        String s = format.format(8);
        System.out.println(s);
    }
}
