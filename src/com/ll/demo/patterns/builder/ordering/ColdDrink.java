package com.ll.demo.patterns.builder.ordering;

/**
 * @author ll
 * @date 2018/9/18 下午3:52
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
