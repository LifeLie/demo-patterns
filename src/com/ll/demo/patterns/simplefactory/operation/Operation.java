package com.ll.demo.patterns.simplefactory.operation;

/**
 * 运算接口
 * @author ll
 * @date 2018/7/23 上午12:18
 */
public interface Operation {

    /**
     * 获取运算结果，子类需实
     * @param numberA value1
     * @param numberB value2
     * @return double type
     */
    double getResult(double numberA, double numberB);

}
