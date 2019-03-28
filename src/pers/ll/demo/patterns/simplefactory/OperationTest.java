package pers.ll.demo.patterns.simplefactory;

import pers.ll.demo.patterns.simplefactory.operation.Operation;
import pers.ll.demo.patterns.simplefactory.operation.OperationFactory;

/**
 * @author ll
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
