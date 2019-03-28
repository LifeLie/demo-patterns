package pers.ll.demo.patterns.proxy.demo;

/**
 * 定义Proxy所代表的真实实体
 * @author ll
 * @date 2018/8/21 上午9:54
 */
public class RealSubject implements Subject {

    @Override
    public void operationA() {
        System.out.println("具体操作A···");
    }

    @Override
    public void operationB() {
        System.out.println("具体操作B···");
    }
}
