package com.ll.demo.patterns.prototype.simpleClone;

/**
 * 原型对象，需要实现Cloneable
 * 基本类型数据，无论是浅克隆还是深克隆，都会进行原值克隆
 */
public class Person implements Cloneable {

    private String name;

    private String age;

    private String sex;

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public Person clone() {
        //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
