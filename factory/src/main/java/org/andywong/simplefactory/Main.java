package org.andywong.simplefactory;

/**
 * 测试方法
 *
 * @author andywong
 * @date 2019-05-09 16:43
 */
public class Main {

    public static void main(String[] args) {
        IFruit fruit = MilkTeaShopFactory.provide("lm");
        fruit.taste();
    }
}
