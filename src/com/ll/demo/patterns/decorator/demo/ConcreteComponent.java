package com.ll.demo.patterns.decorator.demo;

/**
 * 定义具体的对象，也可以给该对象添加一些职责
 *
 * @author ll
 * @date 2018/8/1 下午2:53
 */
public class ConcreteComponent extends Component {

    public ConcreteComponent() {
        System.out.println("初始化具体对象···");
    }

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
