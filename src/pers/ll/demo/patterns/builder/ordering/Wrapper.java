package pers.ll.demo.patterns.builder.ordering;

/**
 * 包装纸
 * @author ll
 * @date 2018/9/18 下午3:40
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸质包装";
    }
}
