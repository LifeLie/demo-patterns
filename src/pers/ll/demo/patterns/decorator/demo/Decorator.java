package pers.ll.demo.patterns.decorator.demo;

/**
 * 装饰抽象类，继承了Component类，从外类来扩展Component类的功能
 * 但对于Component类来说，不需要知道Decorator类的存在
 *
 * @author ll
 * @date 2018/8/1 下午2:57
 */
public abstract class Decorator extends Component {

    protected Component component;

    public Decorator(Component component) {
        System.out.println("Decorator有参初始化···");
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
