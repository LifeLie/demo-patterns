package com.ll.demo.patterns.prototype;

import com.ll.demo.patterns.prototype.deepClone.Resume;

/**
 * @author 良辰
 * @date 2018/9/15 上午11:10
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        Resume a = new Resume("张三");
        a.setWorkExperience("A公司", "2年");

        Resume b = a.clone();
        b.setWorkExperience("B公司", "3年");

        Resume c = a.clone();
        c.setWorkExperience("C公司", "4年");


        a.disPlay();
        b.disPlay();
        c.disPlay();

    }
}
