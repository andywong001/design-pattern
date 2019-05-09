package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 鲜果系列
 */
public class FreshFruitProduct implements IProduct {
    @Override
    public void taste(String name) {
        System.out.println(name + "鲜果榨汁");
    }
}
