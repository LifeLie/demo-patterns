package pers.ll.demo.patterns.builder.ordering;

/**
 * 汉堡类，
 * @author ll
 * @date 2018/9/18 下午3:43
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
