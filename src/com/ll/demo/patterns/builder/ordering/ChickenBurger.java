package com.ll.demo.patterns.builder.ordering;

/**
 * @author 良辰
 * @date 2018/9/18 下午3:56
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
