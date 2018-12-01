package com.ll.demo.patterns.decorator.dress;

/**
 * @author ll
 * @date 2018/8/17 下午2:39
 */
public class SuitA extends Suit {

    public SuitA(Dress dress) {
        super(dress);
    }

    @Override
    public void dress() {
        super.dress();
        test();
    }

    private void test() {
        System.out.println("穿衬衫");
    }

}
