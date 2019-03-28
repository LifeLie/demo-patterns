package pers.ll.demo.patterns.factory.car;

/**
 * @author ll
 * @date 2018/8/30 下午5:52
 */
public class BMWCar extends Car {

    public BMWCar() {
        System.out.println("BMW is born ···");
    }

    @Override
    public void drive() {
        System.out.println("Drive BMW ···");
    }

}
