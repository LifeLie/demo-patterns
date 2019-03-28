package pers.ll.demo.patterns.strategy;

import pers.ll.demo.patterns.strategy.cash.CashContext;

/**
 * @author ll
 * @date 2018/7/27 下午1:55
 */
public class CashTest {

    public static void main(String[] args) {
        String str1 = "正常收费";
        CashContext context = new CashContext(str1);
        System.out.println(str1 + ":" + context.getResult(600));

        String str2 = "满300返100";
        CashContext context2 = new CashContext(str2);
        System.out.println(str2 + ":" + context2.getResult(600));

        String str3 = "打8折";
        CashContext context3 = new CashContext(str3);
        System.out.println(str3 + ":" + context3.getResult(600));
    }

}
