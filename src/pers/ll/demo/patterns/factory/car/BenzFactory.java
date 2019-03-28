package pers.ll.demo.patterns.factory.car;

/**
 * @author ll
 * @date 2018/8/30 下午5:55
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car excute() {
        return new BenzCar();
    }
}
