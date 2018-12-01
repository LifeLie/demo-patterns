package com.ll.demo.patterns.strategy.algorithm;

/**
 * 算法本身只是一种策略，最重要的是这些算法随时都可能互相替换，这就是变化点
 * 利用该类封装变化点
 * @author ll
 * @date 2018/7/26 上午12:28
 */
public class Context {

    private Algorithm algorithm;

    /**
     * 初始化时传入具体策略对象
     */
    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * 根据具体策略对象，调用其算法
     */
    public void contextInterface() {
        algorithm.algorithmInterface();
    }

}
