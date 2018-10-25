package com.ll.demo.patterns.observer.demo;

/**
 * 具体观察者，实现更新接口，以便使本身的状态与主题的状态相协调
 *
 * @author 良辰
 * @date 2018/9/19 上午11:21
 */
public class ConcreteObserverC extends Observer {
    @Override
    public void update() {
        System.out.println("C 更新···");
    }
}
