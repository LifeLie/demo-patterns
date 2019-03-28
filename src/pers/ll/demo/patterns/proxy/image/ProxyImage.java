package pers.ll.demo.patterns.proxy.image;

/**
 * @author ll
 * @date 2018/8/21 上午10:30
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage("imageName");
        }
        realImage.display();
    }
}
