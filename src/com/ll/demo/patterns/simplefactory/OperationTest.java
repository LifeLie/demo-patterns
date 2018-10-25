package com.ll.demo.patterns.simplefactory;

import com.ll.demo.patterns.simplefactory.operation.Operation;
import com.ll.demo.patterns.simplefactory.operation.OperationFactory;

/**
 * @author 良辰
 * @date 2018/7/23 上午1:40
 */
public class OperationTest {

    public static void main(String[] args) {
        testOperation();
    }


    public static void testOperation() {
        Operation operation = OperationFactory.createOperate("/");
        double result = operation.getResult(6, 1.5);
        System.out.println("result:" + result);
    }

}
