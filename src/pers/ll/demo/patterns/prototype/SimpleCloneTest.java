package pers.ll.demo.patterns.prototype;

import pers.ll.demo.patterns.prototype.simpleClone.Person;

/**
 * 测试类
 */
public class SimpleCloneTest {

    public static void main(String[] args) {
        PersonCache.loadCache();

        Person person = PersonCache.getPerson("tom");
        System.out.println(person.toString());
        System.out.println(person.hashCode());

        Person person1 = PersonCache.getPerson("tom");
        System.out.println(person1.toString());
        System.out.println(person1.hashCode());

    }
}
