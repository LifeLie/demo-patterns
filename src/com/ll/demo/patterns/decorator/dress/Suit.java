package com.ll.demo.patterns.decorator.dress;

/**
 * 使用抽象类，实现接口，但是无需实现接口的方法
 *
 * @author 良辰
 * @date 2018/8/17 下午2:43
 */
public abstract class Suit implements Dress {

    protected Dress dress;

    public Suit(Dress dress) {
        this.dress = dress;
    }


    @Override
    public void dress() {
        if (dress != null) {
            dress.dress();
        }
    }
}
