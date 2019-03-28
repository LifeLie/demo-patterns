package pers.ll.demo.exercise.leetcode;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 *
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 *
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 *
 * @author ll
 * @date 2019/2/26 4:19 PM
 */
public class Code977 {

    public static void main(String[] args) {
        int[] a = new int[]{-7,-3,2,3,11};
        int[] r = sortedSquares(a);

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }

    public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }

}
