package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 蜂蜜系列
 */
public class HoneyProduct implements IProduct {
    @Override
    public void taste(String name) {
        System.out.println(name + "蜂蜜味");
    }
}
