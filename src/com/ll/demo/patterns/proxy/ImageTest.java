package com.ll.demo.patterns.proxy;

import com.ll.demo.patterns.proxy.image.ProxyImage;

/**
 * @author 良辰
 * @date 2018/8/21 上午10:33
 */
public class ImageTest {


    public static void main(String[] args) {
        // 第一次的时候，需要加载图片，再展示
        ProxyImage proxyImage = new ProxyImage("xxx.png");
        System.out.println("第一次");
        proxyImage.display();

        // 第二次无需加载图片，直接展示
        System.out.println("第二次");
        proxyImage.display();
    }
}
