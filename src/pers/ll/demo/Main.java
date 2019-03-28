package pers.ll.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//               System.out.println("hello ");
//
//
//        String cashTime = "20160202112233";
//
//        String version = "20170202112233";
//
//        int compare = version.compareTo(cashTime);
//
//        if (compare > 0) {
//            System.out.println("AA");
//        } else {
//            System.out.println("EE");
//        }

//        test1();

        test2(3);
    }


    public static void test2(int total) {

        List<Integer> list = new ArrayList<>();
        int size = 10;
        int line = 0;

        int time = 0;

        while (total > 0) {
            line++;
            list.add(line);
            if (line % size == 0) {
                time++;
                System.out.println("插表" + time + "次：" + list.toString());
                list.clear();
            }
            total--;
        }

        if (list.size() >= 0) {
            System.out.println("最后一次插表：" + list.toString());
            list.clear();
        }


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
            if (next.equals("b")) {
                it.remove();
            }
        }
        System.out.println(list.toString());
    }
}
