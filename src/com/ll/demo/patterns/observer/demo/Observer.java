package com.ll.demo.patterns.observer.demo;

/**
 * 观察者 抽象类，为所有观察者定义一个接口，在得到主题的通知时更新自己
 * @author ll
 * @date 2018/9/19 上午11:00
 */
public abstract class Observer {

    /**
     * 更新
     */
    public abstract void update();
}
