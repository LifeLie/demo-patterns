package pers.ll.demo.patterns.builder.demo;

/**
 * 抽象建造者类，确定产品组成，并声明一个得到产品建造结果的方法
 * @author ll
 * @date 2018/9/18 下午5:49
 */
public interface ProductBuilder {

    void buildPartOne();

    void buildPartTwo();

    Product getResult();
}
