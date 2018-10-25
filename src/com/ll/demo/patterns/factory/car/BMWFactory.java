package com.ll.demo.patterns.factory.car;

/**
 * @author 良辰
 * @date 2018/8/30 下午5:52
 */
public class BMWFactory implements CarFactory {
    @Override
    public Car excute() {
        return new BMWCar();
    }
}
