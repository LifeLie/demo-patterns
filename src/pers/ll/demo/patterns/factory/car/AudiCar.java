package pers.ll.demo.patterns.factory.car;

/**
 * @author ll
 * @date 2018/8/30 下午5:44
 */
public class AudiCar extends Car {

    public AudiCar() {
        System.out.println("Audi is born ···");
    }

    @Override
    public void drive() {
        System.out.println("Drive Audi ···");
    }

}
