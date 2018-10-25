package com.ll.demo.patterns.builder.ordering;

/**
 * @author 良辰
 * @date 2018/9/18 下午3:59
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
