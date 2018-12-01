package com.ll.demo.patterns.builder.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个组件组成
 * @author ll
 * @date 2018/9/18 下午5:45
 */
public class Product {

    private List<String> list = new ArrayList<>();

    /**
     * 添加产品部件
     * @param part 部件
     */
    public void addPart(String part) {
        list.add(part);
    }

    /**
     * 展示所有产品部件
     */
    public void show() {
        System.out.println(list.toString());
    }

}
