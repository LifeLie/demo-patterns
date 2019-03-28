package pers.ll.demo.patterns.decorator;

import pers.ll.demo.patterns.decorator.dress.Person;
import pers.ll.demo.patterns.decorator.dress.SuitA;
import pers.ll.demo.patterns.decorator.dress.SuitB;
import pers.ll.demo.patterns.decorator.dress.SuitC;

/**
 * @author ll
 * @date 2018/8/17 下午3:18
 */
public class DressTest {

    public static void main(String[] args) {
        // 每个装饰对象只需要关心自己的功能，无需关注如何添加到对象链中
        Person person = new Person("吴彦祖");
        SuitA suitA = new SuitA(person);
        SuitB suitB = new SuitB(suitA);
        SuitC suitC = new SuitC(suitB);
        suitC.dress();

        System.out.println("-------------");

        // 顺序根据需求随时可以变
        Person person2 = new Person("金城武");
        SuitC suitCC = new SuitC(person2);
        SuitB suitBB = new SuitB(suitCC);
        SuitA suitAA = new SuitA(suitBB);
        suitAA.dress();
    }
}
