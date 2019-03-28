package pers.ll.demo.patterns.decorator.dress;

/**
 * @author ll
 * @date 2018/8/17 下午3:16
 */
public class SuitC extends Suit {

    public SuitC(Dress dress) {
        super(dress);
    }

    @Override
    public void dress() {
        super.dress();
        test();
    }

    private void test() {
        System.out.println("穿运动鞋");
    }
}
