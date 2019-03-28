package pers.ll.demo.patterns.state.demo;

/**
 * 抽象状态(State)角色
 * 定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为
 * @author ll
 * @date 2018/9/21 下午3:27
 */
public abstract class State {

    /**
     * 状态对应的处理
     * @param param
     */
    public abstract void handle(String param);

}
