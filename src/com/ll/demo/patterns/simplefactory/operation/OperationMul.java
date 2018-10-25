package com.ll.demo.patterns.simplefactory.operation;

/**
 * 乘法运算
 *
 * @author 良辰
 * @date 2018/7/23 上午1:25
 */
public class OperationMul implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }

}
