package com.ll.demo.patterns.proxy.image;

/**
 * @author ll
 * @date 2018/8/21 上午10:27
 */
public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        System.out.println("load " + imageName);
    }

    @Override
    public void display() {
        System.out.println("display " + imageName);
    }

}
