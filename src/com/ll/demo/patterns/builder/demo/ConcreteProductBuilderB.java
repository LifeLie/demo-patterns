package com.ll.demo.patterns.builder.demo;

/**
 * 建造具体的部件
 * @author ll
 * @date 2018/9/18 下午5:52
 */
public class ConcreteProductBuilderB implements ProductBuilder {

    private Product product = new Product();

    @Override
    public void buildPartOne() {
        product.addPart("B1");
    }

    @Override
    public void buildPartTwo() {
        product.addPart("B2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
