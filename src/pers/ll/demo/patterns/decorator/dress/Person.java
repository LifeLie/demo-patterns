package pers.ll.demo.patterns.decorator.dress;

/**
 * @author ll
 * @date 2018/8/17 下午2:31
 */
public class Person implements Dress {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void dress() {
        System.out.println(name + "开始穿衣服");
    }
}
