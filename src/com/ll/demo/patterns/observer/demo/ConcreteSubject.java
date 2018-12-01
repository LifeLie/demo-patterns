package com.ll.demo.patterns.observer.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题，存入具体观察者对象，在具体主题内部状态改变时，给所有登记过的观察者发出通知
 *
 * @author ll
 * @date 2018/9/19 上午11:03
 */
public class ConcreteSubject extends Subject {

    /**
     * 存入具体观察者对象
     */
    private List<Observer> list = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer :
                list) {
            observer.update();
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
