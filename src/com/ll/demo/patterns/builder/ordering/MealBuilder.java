package com.ll.demo.patterns.builder.ordering;

/**
 * @author 良辰
 * @date 2018/9/18 下午4:11
 */
public class MealBuilder {

    public Meal combo1() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal combo2() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
