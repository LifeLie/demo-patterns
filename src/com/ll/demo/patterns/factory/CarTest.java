package com.ll.demo.patterns.factory;

import com.ll.demo.patterns.factory.car.*;

/**
 * @author 良辰
 * @date 2018/8/30 下午5:55
 */
public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = new BenzFactory();
        Car car = factory.excute();
        car.drive();

        System.out.println("------");

        CarFactory factory2 = new BMWFactory();
        Car car2 = factory2.excute();
        car2.drive();

        System.out.println("------");

        CarFactory factory3 = new AudiFactory();
        Car car3 = factory3.excute();
        car3.drive();
    }

}
