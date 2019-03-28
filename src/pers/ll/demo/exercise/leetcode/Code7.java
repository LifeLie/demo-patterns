package pers.ll.demo.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author ll
 * @date 2019/2/26 3:56 PM
 */
public class Code7 {

    public static void main(String[] args) {

        int number = 12345;

        int s1 = reverse(number);

        System.out.println("结果：" + s1);
    }


    /**
     * 重复“弹出” x 的最后一位数字，并将它“推入”到 rev 的后面。最后，rev 将与 x 相反。
     *
     * 要在没有辅助堆栈 / 数组的帮助下 “弹出” 和 “推入” 数字，我们可以使用数学方法。
     *
     * //pop operation:
     * pop = x % 10;
     * x /= 10;
     * //push operation:
     * temp = rev * 10 + pop;
     * rev = temp;
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            // 重复“弹出” x 的最后一位数字
            int pop = x % 10;
            x /= 10;

            /*
             * 事先检查rev * 10 + pop这个语句是否会导致溢出
             * int的取值范围为： -2^31——2^31-1，即-2147483648——2147483647
            */
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            // 将 x 弹出的数字“推入”到 rev 的后面
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
