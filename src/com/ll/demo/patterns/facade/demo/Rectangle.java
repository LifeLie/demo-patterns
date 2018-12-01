package com.ll.demo.patterns.facade.demo;

/**
 * 长方形
 *
 * @author ll
 * @date 2018/9/17 下午5:17
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a Rectangle···");
    }
}
