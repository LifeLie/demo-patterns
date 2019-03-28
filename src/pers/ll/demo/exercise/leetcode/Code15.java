package pers.ll.demo.exercise.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * <p>
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 * @author ll
 * @date 2019/3/26 10:09 AM
 */
public class Code15 {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> sum = threeSum(nums);
        System.out.println("结果：" + sum.toString());

        List<Integer> list = sum.get(0);
        int remove = list.remove(0);
        System.out.println("结果2：" + remove);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // 先排序，变成线性查找，只需要n次，否则下方查找匹配的a1和a2会变成n*n
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 当前值不能与上一个值相同，跳过可能重复的答案
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int a1 = i + 1, a2 = nums.length - 1;
                while (a1 < a2) {
                    if (nums[i] + nums[a1] + nums[a2] == 0) {
//                        List<Integer> tmp = new ArrayList<>();
//                        tmp.add(nums[i]);
//                        tmp.add(nums[a1]);
//                        tmp.add(nums[a2]);
//                        list.add(tmp);
                        list.add(Arrays.asList(nums[i], nums[a1], nums[a2]));
                        // 去重
                        while (a1 < a2 && nums[a1] == nums[a1 + 1]) {
                            a1++;
                        }
                        while (a1 < a2 && nums[a2] == nums[a2 - 1]) {
                            a2--;
                        }
                        a1++;
                        a2--;
                    } else if (nums[i] + nums[a1] + nums[a2] < 0){
                        while (a1 < a2 && nums[a1] == nums[a1 + 1]) {
                            a1++;
                        }
                        a1++;
                    } else {
                        while (a1 < a2 && nums[a2] == nums[a2 - 1]) {
                            a2--;
                        }
                        a2--;
                    }
                }
            }
        }
        return list;
    }

}
