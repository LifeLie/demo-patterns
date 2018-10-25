package com.ll.demo.patterns.decorator.demo;

/**
 * @author 良辰
 * @date 2018/8/14 下午5:17
 */
public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
        System.out.println("A初始化···");
    }

    @Override
    public void operation() {
        System.out.println("A 装饰前···");
        // 先运行原Component的operation()，在执行本类的功能，相当于在原来的基础上进行了装饰
        super.operation();
        test();
        System.out.println("A 装饰后···");
    }

    private void test() {
        System.out.println("A 操作···");
    }

}
