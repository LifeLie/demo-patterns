package com.ll.demo.patterns.strategy;

import com.ll.demo.patterns.strategy.algorithm.AlgorithmA;
import com.ll.demo.patterns.strategy.algorithm.AlgorithmB;
import com.ll.demo.patterns.strategy.algorithm.AlgorithmC;
import com.ll.demo.patterns.strategy.algorithm.Context;

/**
 * @author 良辰
 * @date 2018/7/26 上午12:39
 */
public class AlgorithmTest {

    public static void main(String[] args) {

        Context contextA = new Context(new AlgorithmA());
        contextA.contextInterface();
        Context contextB = new Context(new AlgorithmB());
        contextB.contextInterface();
        Context contextC = new Context(new AlgorithmC());
        contextC.contextInterface();
    }

}
