package pers.ll.demo.patterns.adapter;

import pers.ll.demo.patterns.adapter.demo.Adapter;
import pers.ll.demo.patterns.adapter.demo.Target;

/**
 * 适配器模式
 *
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * @author ll
 * @date 2019/2/27 4:04 PM
 */
public class DemoTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();

    }
}
