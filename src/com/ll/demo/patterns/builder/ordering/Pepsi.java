package com.ll.demo.patterns.builder.ordering;

/**
 * @author ll
 * @date 2018/9/18 下午4:00
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 11.0f;
    }
}
