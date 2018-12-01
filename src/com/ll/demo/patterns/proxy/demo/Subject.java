package com.ll.demo.patterns.proxy.demo;

/**
 * 定义了RealSubject和Proxy类共用的接口，这样就可以在任何使用RealSubject的地方都可以使用Proxy
 *
 * @author ll
 * @date 2018/8/21 上午9:46
 */
public interface Subject {

    void operationA();

    void operationB();

}