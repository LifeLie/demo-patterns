package com.ll.demo.patterns.observer;

import com.ll.demo.patterns.observer.demo.*;

/**
 * @author 良辰
 * @date 2018/9/19 下午2:44
 */
public class Test {

    public static void main(String[] args) {
//        testDemo1();

        testDemo2();

    }

    private static void testDemo2() {
        ConcreteSubjectTwo subjectTwo = new ConcreteSubjectTwo();

        new ConcreteObserverAA(subjectTwo);
        new ConcreteObserverBB(subjectTwo);
        new ConcreteObserverCC(subjectTwo);

        subjectTwo.setStatus("test");

        subjectTwo.setStatus("sssss");

    }

    private static void testDemo1() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserverA());
        subject.attach(new ConcreteObserverB());
        subject.attach(new ConcreteObserverC());

        subject.notifyAllObserver();
    }
}
