package pers.ll.demo.patterns.builder.ordering;

/**
 * @author ll
 * @date 2018/9/18 下午3:55
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
