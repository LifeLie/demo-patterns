package pers.ll.demo.patterns.simplefactory.operation;

/**
 * 减法运算
 * @author ll
 * @date 2018/7/23 上午12:47
 */
public class OperationSub implements Operation{


    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }

}
