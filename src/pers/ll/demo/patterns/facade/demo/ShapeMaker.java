package pers.ll.demo.patterns.facade.demo;

/**
 * 将请求代理给适当的子系统对象
 * @author ll
 * @date 2018/9/17 下午5:21
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;


    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }


}
