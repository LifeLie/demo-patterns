package pers.ll.demo.patterns.builder.ordering;

/**
 * @author ll
 * @date 2018/9/18 下午3:38
 */
public interface Item {

    String name();

    Packing packing();

    float price();

}
