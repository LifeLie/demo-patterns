package com.ll.demo.patterns.template.demo;

/**
 * @author 良辰
 * @date 2018/9/17 下午3:33
 */
public class ConcreteB extends Template {

    @Override
    void primitiveOperation1() {
        System.out.println("具体实现B类，操作1···");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("具体实现B类，操作2···");
    }
}
