package pers.ll.demo.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. 罗马数字转整数
 *
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M，对应 1，5，10，50，100，500，1000
 * <p>
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。
 * 但也存在特例，例如 4 不写做 IIII，而是 IV。
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * <p>
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * <p>
 * 示例 1:
 * 输入: 3
 * 输出: "III"
 * <p>
 * 示例 2:
 * 输入: 4
 * 输出: "IV"
 * <p>
 * 示例 3:
 * 输入: 9
 * 输出: "IX"
 * <p>
 * 示例 4:
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * <p>
 * 示例 5:
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Code13 {

    public static void main(String[] args) {

        String str = "XC";

        int num = intToRoman(str);

        System.out.println("结果：" + num);
    }

    /**
     * 首先建立一个HashMap来映射符号和值，然后对字符串从左到右来，
     * 如果当前字符代表的值不小于其右边，就加上该值；否则就减去该值。
     * 以此类推到最左边的数，最终得到的结果即是答案
     * @param s
     * @return
     */
    public static int intToRoman(String s) {

        int[] a = {1, 5, 10, 50, 100, 500, 1000};
        char[] b = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            map.put(b[i], a[i]);
        }

        int num = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int v1 = map.get(c);
            if (i == chars.length - 1) {
                num += v1;
            } else {
                int v2 = map.get(chars[i + 1]);
                if (v1 >= v2) {
                    num += v1;
                } else {
                    num -= v1;
                }
            }
        }

        return num;
    }

}
