package pers.ll.demo.patterns.state.demo;

/**
 * 具体状态类B
 * 每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
 * @author ll
 * @date 2018/11/14 5:21 PM
 */
public class ConcreteStateB extends State {

    /**
     * 切换状态
     * @param param 参数
     */
    @Override
    public void handle(String param) {
        System.out.println("ConcreteStateB handle ：" + param);
    }
}
