package com.ll.demo.patterns.facade.demo;

/**
 * 圆形
 * @author 良辰
 * @date 2018/9/17 下午5:19
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a Circle···");
    }
}
