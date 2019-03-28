package pers.ll.demo.patterns.adapter.demo;

/**
 * 适配器类
 * @author ll
 * @date 2019/2/27 3:58 PM
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
