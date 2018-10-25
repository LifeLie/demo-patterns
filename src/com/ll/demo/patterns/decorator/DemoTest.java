package com.ll.demo.patterns.decorator;

import com.ll.demo.patterns.decorator.demo.ConcreteComponent;
import com.ll.demo.patterns.decorator.demo.ConcreteDecoratorA;
import com.ll.demo.patterns.decorator.demo.ConcreteDecoratorB;

/**
 * 装饰器模式允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式
 * 就增加功能来说，装饰器模式相比生成子类更为灵活
 *
 * @author 良辰
 * @date 2018/8/16 下午3:49
 */
public class DemoTest {

    /**
     * 注意代理模式主要是用于控制，装饰器模式主要是用于增强功能
     * @param args
     */
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }

}
