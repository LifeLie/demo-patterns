package com.ll.demo.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author ll
 * @date 2019/2/26 10:20 AM
 */
public class Code1 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sum = twoSum(nums, target);

        System.out.println("" + sum[0] + sum[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    int n2 = nums[j];
                    if (n1 + n2 == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }


    /**
     * 进行迭代并将元素插入到map中，通过判断表中是否包含符合条件的目标元素，快速找到结果
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v)) {
                return new int[]{map.get(v), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
