package pers.ll.demo.patterns.proxy.demo;

/**
 * 代理类，保存一个引用使得代理可以访问实体，并提供Subject的接口，这样代理就可以用来代替实体
 * @author ll
 * @date 2018/8/21 上午9:55
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void operationA() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.operationA();
    }

    @Override
    public void operationB() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.operationB();
    }
}
