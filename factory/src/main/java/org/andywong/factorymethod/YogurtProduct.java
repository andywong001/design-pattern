package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 酸奶系列
 */
public class YogurtProduct implements IProduct {
    @Override
    public void taste(String name) {
        System.out.println(name + "酸奶味");
    }
}
