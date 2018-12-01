package com.ll.demo.patterns.strategy.cash;

/**
 * 打折收费类
 * @author ll
 * @date 2018/7/27 上午11:10
 */
public class CashRebate extends CashSuper {

    private double moneyRebate ;
    public CashRebate(String rebate) {
        this.moneyRebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
