package pers.ll.demo.patterns.facade.demo;

/**
 * 正方形
 * @author ll
 * @date 2018/9/17 下午5:20
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a Square···");
    }
}
