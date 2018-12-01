package com.ll.demo.patterns.strategy.cash;

/**
 * @author ll
 * @date 2018/7/27 下午1:43
 */
public class CashContext {

    private CashSuper cashSuper;

    /**
     * 结合简单工厂模式，讲具体实例化策略的过程由客户端转移到Context类中
     *
     * @param type
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            default:
                cashSuper = null;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
