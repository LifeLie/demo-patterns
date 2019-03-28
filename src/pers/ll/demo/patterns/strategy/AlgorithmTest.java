package pers.ll.demo.patterns.strategy;

import pers.ll.demo.patterns.strategy.algorithm.AlgorithmA;
import pers.ll.demo.patterns.strategy.algorithm.AlgorithmB;
import pers.ll.demo.patterns.strategy.algorithm.AlgorithmC;
import pers.ll.demo.patterns.strategy.algorithm.Context;

/**
 * @author ll
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
