package pers.ll.demo.patterns.simplefactory.operation;

/**
 * 加法运算
 * @author ll
 * @date 2018/7/23 上午12:21
 */
public class OperationAdd implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }

}
