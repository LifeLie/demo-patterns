package com.ll.demo.patterns.factory.car;

/**
 * @author ll
 * @date 2018/8/30 下午5:54
 */
public class BenzCar extends Car {

    public BenzCar() {
        System.out.println("Benz is born ···");
    }

    @Override
    public void drive() {
        System.out.println("Drive Benz ···");
    }
}
