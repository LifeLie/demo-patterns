package pers.ll.demo.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 6.Z 字形变换
 *
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 *
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * @author ll
 * @date 2019/2/26 3:56 PM
 */
public class Code6 {

    public static void main(String[] args) {

        String s = "LEETCODEISHIRING";

        int num = 2;

        String s1 = convert(s, num);

        System.out.println("结果：" + s1);
    }


    /**
     *
     * @param s 字符串
     * @param numRows 行数
     * @return
     */
    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        // 我们可以使用 min(numRows,len(s)) 个列表来表示 Z 字形图案中的非空行。
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        // 当前行
        int curRow = 0;
        // 当前方向
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            // 从左到右迭代s将每个字符添加到合适的行。
            rows.get(curRow).append(c);
            // 只有当我们向上移动到最上面的行或向下移动到最下面的行时，当前方向才会发生改变。
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

}
