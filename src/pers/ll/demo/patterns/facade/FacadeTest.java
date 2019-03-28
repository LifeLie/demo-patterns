package pers.ll.demo.patterns.facade;

import pers.ll.demo.patterns.facade.demo.ShapeMaker;

/**
 * @author ll
 * @date 2018/9/17 下午5:22
 */
public class FacadeTest {
    public static void main(String[] args) {
        // 客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
