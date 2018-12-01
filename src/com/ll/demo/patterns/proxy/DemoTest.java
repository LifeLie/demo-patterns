package com.ll.demo.patterns.proxy;

import com.ll.demo.patterns.proxy.demo.Proxy;

/**
 * @author ll
 * @date 2018/8/21 上午10:19
 */
public class DemoTest {

    /**
     * 注意代理模式主要是用于控制，装饰器模式主要是用于增强功能
     * @param args
     */
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.operationA();
        proxy.operationB();
    }
}
