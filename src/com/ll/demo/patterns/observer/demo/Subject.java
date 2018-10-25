package com.ll.demo.patterns.observer.demo;

/**
 * 主题 抽象类，每个主题都可以有任何数量的观察者
 * @author 良辰
 * @date 2018/9/19 上午10:55
 */
public abstract class Subject {

    /**
     * 内部状态
     */
    public String status;

    /**
     * 增加
     */
    public abstract void attach(Observer observer);

    /**
     * 删除
     */
    public abstract void detach(Observer observer);

    /**
     * 通知所有观察者
     */
    public abstract void notifyAllObserver();

}
