package pers.ll.demo.exercise.leetcode;

/**
 * 709.转换成小写字母
 *
 *
 *
 * 示例 1：
 * 输入: "Hello"
 * 输出: "hello"
 *
 * 示例 2：
 * 输入: "here"
 * 输出: "here"
 *
 * 示例 3：
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * @author ll
 * @date 2019/2/26 4:27 PM
 */
public class Code709 {

    public static void main(String[] args) {

        String s = "Hello";
        String ss = toLowerCase(s);
        System.out.println("结果：" + ss);

    }


    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }

}
