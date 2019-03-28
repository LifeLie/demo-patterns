package pers.ll.demo.patterns.simplefactory.operation;

/**
 * 除法运算
 * @author ll
 * @date 2018/7/23 上午1:27
 */
public class OperationDiv implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA / numberB;
    }

}
