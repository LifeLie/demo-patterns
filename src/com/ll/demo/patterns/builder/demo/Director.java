package com.ll.demo.patterns.builder.demo;

/**
 * 指挥者类，用于指挥建造过程
 *
 * @author 良辰
 * @date 2018/9/18 下午5:55
 */
public class Director {

    public void construct(ProductBuilder builder) {
        builder.buildPartOne();
        builder.buildPartTwo();
    }

}
