package pers.ll.demo.patterns.decorator.dress;

/**
 * @author ll
 * @date 2018/8/17 下午3:15
 */
public class SuitB extends Suit {

    public SuitB(Dress dress) {
        super(dress);
    }

    @Override
    public void dress() {
        super.dress();
        test();
    }

    private void test() {
        System.out.println("穿牛仔裤");
    }
}
