package com.ll.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello ");

        test1();
    }


    public static void test1() {
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("b")){
                it.remove();
            }
        }
        System.out.println(list.toString());
    }
}
