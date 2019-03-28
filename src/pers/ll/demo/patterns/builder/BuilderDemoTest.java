package pers.ll.demo.patterns.builder;

import pers.ll.demo.patterns.builder.demo.ConcreteProductBuilderA;
import pers.ll.demo.patterns.builder.demo.ConcreteProductBuilderB;
import pers.ll.demo.patterns.builder.demo.Director;

/**
 * 建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们的配装方式时适用的模式
 * @author ll
 * @date 2018/9/18 下午5:58
 */
public class BuilderDemoTest {

    public static void main(String[] args) {
        Director director = new Director();

        ConcreteProductBuilderA builderA = new ConcreteProductBuilderA();
        // 指挥者使用builder的方法建造产品
        director.construct(builderA);
        builderA.getResult().show();

        System.out.println();

        ConcreteProductBuilderB builderB = new ConcreteProductBuilderB();
        // 指挥者使用builder的方法建造产品
        director.construct(builderB);
        builderB.getResult().show();
    }
}
