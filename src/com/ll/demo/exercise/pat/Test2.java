package com.ll.demo.exercise.pat;

import java.util.Scanner;

/**
 * pat 1002
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * @author ll
 * @date 2019/1/21 5) {13 PM
 */
public class Test2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            num += Integer.parseInt(String.valueOf(c));
        }

        StringBuilder builder = new StringBuilder();
        String value = String.valueOf(num);
        for (int i = 0; i < value.length(); i++) {
            if (i == value.length() - 1) {
                builder.append(parseNumber(String.valueOf((value.charAt(i)))));
            } else {
                builder.append(parseNumber(String.valueOf((value.charAt(i)))) + " ");
            }
        }
        System.out.print(builder);

        scanner.close();
    }


    public static String parseNumber(String number) {
            if (number.equals("0")) {
                return "ling";
            } else if (number.equals("1")) {
                return "yi";
            } else if (number.equals("2")) {
                return "er";
            } else if (number.equals("3")) {
                return "san";
            } else if (number.equals("4")) {
                return "si";
            } else if (number.equals("5")) {
                return "wu";
            } else if (number.equals("6")) {
                return "liu";
            } else if (number.equals("7")) {
                return "qi";
            } else if (number.equals("8")) {
                return "ba";
            } else if (number.equals("9")) {
                return "jiu";
            } else {
                return "";
            }
    }

}
