package com.ll.demo.patterns.simplefactory.operation;

/**
 * 运算对象工厂类
 * @author ll
 * @date 2018/7/23 上午12:11
 */
public class OperationFactory {

    /**
     * 根据运算方式返回不同对象
     * @param operate 运算方式
     * @return Operation
     */
    public static Operation createOperate(String operate) {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                operation = null;
        }

        return operation;
    }

}
