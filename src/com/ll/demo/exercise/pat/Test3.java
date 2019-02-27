package com.ll.demo.exercise.pat;

import java.util.Scanner;

/**
 * pat 1003
 * 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
 * 得到“答案正确”的条件是：
 * 1.字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
 * 2.任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 * 3.如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 *
 * 输入格式：
 * 每个测试输入包含 1 个测试用例。第 1 行给出一个正整数 n (<10)，是需要检测的字符串个数。
 * 接下来每个字符串占一行，字符串长度不超过 100，且不包含空格。
 *
 * 输出格式：
 * 每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出 YES，否则输出 NO。
 *
 * @author ll
 * @date 2019/1/21 11:15 PM
 */
public class Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sss = scanner.nextLine();
        int num = Integer.parseInt(sss);

        for (int i = 0; i < num; i++) {
            String next = scanner.nextLine();
            String check = check2(next);
            System.out.println(check);
        }

        scanner.close();
    }

    /**
     * 条件2和条件3放一起考虑
     * 条件2中，xPATx 可以看成 (x个A) * (1个A) = (x个A)
     * 条件3中，aPbTc 可以看成 (a个A) * (b个A) = (c个A)；aPbATca 可以看成 (a个A) * (b+1个A) = (c个A) + (a个A)
     * 由上可得出能通过的正确字符串格式基于 aPbTc ，满足条件 (a个A) * (b个A) = (c个A)
     *
     * @param str
     * @return
     */
    public static String check2(String str) {
        if (str.contains("P") && str.contains("A") && str.contains("T")) {
            String newStr = str;
            newStr = newStr.replace("P", "").replace("A", "").replace("T", "");
            // 替换空格，根据题目，可以不处理
//            str = str.replace("\\s+", "");
            if (newStr.isEmpty()) {
                int p = str.indexOf("P");
                int t = str.indexOf("T");
                int l = str.length();
                int b = t - p - 1;
                int c = l - t - 1;
                if (p * b == c) {
                    return "YES";
                } else {
                    return "NO";
                }
            } else {
                return "NO";
            }
        } else {
            return "NO";
        }
    }

    /**
     * 这种方法没能完全理解题目，只考虑了 PAT PAAT 两种情况
     * @param str
     * @return
     */
//    public static String check(String str) {
//        if (str.length() == 3 && str.equals("PAT")) {
//            return "YES";
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            // 必须仅有 P、 A、 T这三种字符
//            if (c != 'P' && c != 'A' && c != 'T') {
//                break;
//            }
//            // PAT PAAT 两种情况
//            if (c == 'P') {
//                if (i <= str.length() - 4
//                        && (str.substring(i, i + 3).equals("PAT")
//                        || str.substring(i, i + 4).equals("PAAT"))) {
//                    return "YES";
//                }
//            }
//        }
//        return "NO";
//    }

}
