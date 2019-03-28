package pers.ll.demo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ll
 * @date 2018/12/4 3:57 PM
 */
public class FileTest {


    public static void main(String[] args) {
        File file = new File("/Users/ll/test");
        if (file.exists()) {
            System.out.println("存在····");
            if (file.isDirectory()) {
                System.out.println("是文件夹···");
            } else {
                System.out.println("不是文件夹···");
            }
        } else {
            System.out.println("不存在····");
        }

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
