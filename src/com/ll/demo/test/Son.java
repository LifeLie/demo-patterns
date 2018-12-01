package com.ll.demo.test;

/**
 * @author ll
 * @date 2018/11/14 4:27 PM
 */
public class Son extends Father {

    static {
        System.out.println("erzi");
        ttt = "eeee";
    }

    public void printValue() {
        System.out.println("param : " + map.toString());
        System.out.println("ttt : " + ttt);
    }

}
