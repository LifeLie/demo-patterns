package com.ll.demo.exercise.pat;


import java.util.Scanner;

/**
 * pat 1001
 * 3n+1猜想
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
//        if (n > 0 && n <= 1000) {
//            test(n, 0);
//        } else {
//            System.out.println('0');
//        }

        // 简单版
        int i = scanner.nextInt();
        int count = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = (3 * i + 1) / 2;
            }
            count = count + 1;
        }
        System.out.println(count);

        scanner.close();
    }

    public static void test(int n, int count) {
        count++;
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = (3 * n + 1) / 2;
        }
        if (n != 1) {
            test(n, count);
        } else {
            System.out.println(count);
        }

    }
}
