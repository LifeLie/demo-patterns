package pers.ll.demo.exercise.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 5.最长回文子串
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。
 *
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 *
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author ll
 * @date 2019/2/26 3:56 PM
 */
public class Code5 {

    public static void main(String[] args) {

        String s = "nioo123n22nivrwgh";

        String s1 = longestPalindrome(s);

        System.out.println("结果：" + s1);
    }

    /**
     * 我们观察到回文中心的两侧互为镜像。因此，回文可以从它的中心展开，并且只有2n-1个这样的中心。
     *
     *  你可能会问，为什么会是2n-1个，而不是n个中心？原因在于所含字母数为偶数的回文的中心可以处于两字母之间
     *  （例如“abba”的中心在两个‘b’之间）
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}
