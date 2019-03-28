package pers.ll.demo.patterns.state.demo;

/**
 * 环境(Context)角色，也称上下文
 * 定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态
 * @author ll
 * @date 2018/11/14 4:59 PM
 */
public class Context {

    /**
     * 持有一个State类型的对象实例
     */
    private State state;

    public Context() {
    }

    /**
     * 定义Context的初始状态
     * @param state
     */
    public Context(State state) {
        this.state = state;
    }

    /**
     * 对请求做处理
     */
    public void request(String param) {
        state.handle(param);
    }


    public void setState(State state) {
        this.state = state;
    }
}
