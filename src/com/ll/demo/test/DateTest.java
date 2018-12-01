package com.ll.demo.test;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ll
 * @date 2018/9/12 下午4:04
 */
public class DateTest {


    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");

        Date date = new Date();
        System.out.println(sdf.format(date));

        long time = date.getTime();
        long before = time - 7 * 1000 * 60 * 60 * 24;

        Date date2 = new Date(before);
        System.out.println(sdf.format(date2));
    }

}
