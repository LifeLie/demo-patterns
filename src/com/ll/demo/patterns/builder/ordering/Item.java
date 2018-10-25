package com.ll.demo.patterns.builder.ordering;

/**
 * @author 良辰
 * @date 2018/9/18 下午3:38
 */
public interface Item {

    String name();

    Packing packing();

    float price();

}
