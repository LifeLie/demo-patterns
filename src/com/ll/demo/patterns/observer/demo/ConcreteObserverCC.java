package com.ll.demo.patterns.observer.demo;

/**
 * 具体观察者，实现更新接口，以便使本身的状态与主题的状态相协调
 *
 * @author 良辰
 * @date 2018/9/19 上午11:21
 */
public class ConcreteObserverCC extends Observer {
    private Subject subject;

    public ConcreteObserverCC(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Subject change status : " + subject.status + ", CC 更新···");
    }
}
