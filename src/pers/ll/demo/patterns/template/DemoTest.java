package pers.ll.demo.patterns.template;

import pers.ll.demo.patterns.template.demo.ConcreteA;
import pers.ll.demo.patterns.template.demo.ConcreteB;
import pers.ll.demo.patterns.template.demo.Template;

/**
 * @author ll
 * @date 2018/9/17 下午3:37
 */
public class DemoTest {


    public static void main(String[] args) {
        Template concreteA = new ConcreteA();
        concreteA.template();

        System.out.println();

        Template concreteB = new ConcreteB();
        concreteB.template();

    }
}
