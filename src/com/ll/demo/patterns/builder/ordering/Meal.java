package com.ll.demo.patterns.builder.ordering;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 良辰
 * @date 2018/9/18 下午4:02
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    /**
     * 添加商品
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 计算总价
     * @return 价格
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示所有商品
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("项目 : "+item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }

}
