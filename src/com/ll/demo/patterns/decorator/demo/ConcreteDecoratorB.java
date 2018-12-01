package com.ll.demo.patterns.decorator.demo;

/**
 * @author ll
 * @date 2018/8/16 下午3:47
 */
public class ConcreteDecoratorB extends Decorator {


    public ConcreteDecoratorB(Component component) {
        super(component);
        System.out.println("B初始化···");
    }

    @Override
    public void operation() {
        System.out.println("B 装饰前···");
        super.operation();
        test();
        System.out.println("B 装饰后···");
    }

    private void test() {
        System.out.println("B 操作···");
    }

}
