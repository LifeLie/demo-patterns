package com.ll.demo.patterns.strategy.cash;

/**
 * 普通收费类
 * @author ll
 * @date 2018/7/27 上午11:08
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
