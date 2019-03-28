package pers.ll.demo.patterns.template.demo;

/**
 * @author ll
 * @date 2018/9/17 下午3:33
 */
public class ConcreteA extends Template {

    @Override
    void primitiveOperation1() {
        System.out.println("具体实现A类，操作1···");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("具体实现A类，操作2···");
    }
}
