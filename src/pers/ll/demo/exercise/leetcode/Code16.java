package pers.ll.demo.exercise.leetcode;

import java.util.Arrays;


/**
 * 16.最接近的三数之和
 * <p>
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author ll
 * @date 2019/3/26 3:43 PM
 */
public class Code16 {


    public static void main(String[] args) {

        int target = -100;

        int[] nums = {1,1,1,0};

        int sum = threeSumClosest(nums, target);

        System.out.println("结果：" + sum);

    }

    /**
     * 使用双指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int a1 = i + 1, a2 = nums.length - 1;
            while (a1 < a2) {
                int v = nums[i] + nums[a1] + nums[a2];
                if (v < target) {
                    a1++;
                } else if (v > target) {
                    a2--;
                } else {
                    return target;
                }
                if (Math.abs(v - target) < Math.abs(result - target)) {
                    result = v;
                }
            }
        }
        return result;
    }

}
