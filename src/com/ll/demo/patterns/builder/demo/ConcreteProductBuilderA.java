package com.ll.demo.patterns.builder.demo;

/**
 * 建造具体的部件
 * @author 良辰
 * @date 2018/9/18 下午5:52
 */
public class ConcreteProductBuilderA implements ProductBuilder {

    private Product product = new Product();

    @Override
    public void buildPartOne() {
        product.addPart("A1");
    }

    @Override
    public void buildPartTwo() {
        product.addPart("A2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
