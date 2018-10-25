package com.ll.demo.patterns.prototype;

import com.ll.demo.patterns.prototype.simpleClone.Person;

import java.util.HashMap;

/**
 * 缓存类
 */
public class PersonCache {

    private static HashMap<String, Person> map = new HashMap<>();

    /**
     * 初始化数据，这里可以是数据库查询返回的数据
     */
    public static void loadCache() {
        Person person = new Person("tom", "18", "man");
        map.put(person.getName(), person);
    }

    /**
     * 根据id获取克隆对象
     * @param id
     * @return
     */
    public static Person getPerson(String id) {
        Person person = map.get(id);
        return person.clone();
    }

}
