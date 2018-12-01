package com.ll.demo.patterns.builder;

import com.ll.demo.patterns.builder.ordering.Meal;
import com.ll.demo.patterns.builder.ordering.MealBuilder;

/**
 * @author ll
 * @date 2018/9/18 下午4:14
 */
public class OrderdingTest {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.combo1();
        System.out.println("套餐1：");
        meal.showItems();
        System.out.println("总价：" + meal.getCost());

        System.out.println();

        Meal meal2 = mealBuilder.combo2();
        System.out.println("套餐2：");
        meal2.showItems();
        System.out.println("总价：" + meal2.getCost());
    }
}
