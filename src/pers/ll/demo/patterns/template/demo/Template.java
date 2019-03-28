package pers.ll.demo.patterns.template.demo;

/**
 * 模版类
 */
public abstract class Template {


    /**
     * 实现一个算法模版，定义算法的骨架，由子类完成primitiveOperation()的具体实现
     * 为防止恶意操作，一般模板方法都加上 final 关键词。
     */
    public final void template() {

        System.out.println("begin···");

        primitiveOperation1();
        primitiveOperation2();

        System.out.println("end···");

    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

}
