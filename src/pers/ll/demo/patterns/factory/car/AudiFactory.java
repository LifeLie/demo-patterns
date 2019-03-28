package pers.ll.demo.patterns.factory.car;

/**
 * @author ll
 * @date 2018/8/30 下午5:40
 */
public class AudiFactory implements CarFactory {

    @Override
    public Car excute() {
        return new AudiCar();
    }
}
