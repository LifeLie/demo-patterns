package com.ll.demo.patterns.state.demo;

/**
 * 具体状态类A
 * 每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
 * @author ll
 * @date 2018/11/14 5:14 PM
 */
public class ConcreteStateA extends State {

    /**
     * 切换状态
     * @param param 参数
     */
    @Override
    public void handle(String param) {
        System.out.println("ConcreteStateA handle ：" + param);
    }

}
