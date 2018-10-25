package com.ll.demo.patterns.builder.ordering;

/**
 * 瓶装
 * @author 良辰
 * @date 2018/9/18 下午3:41
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装";
    }
}
