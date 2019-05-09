package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 奶昔系列
 */
public class MilkShakeProduct implements IProduct {
    @Override
    public void taste(String name) {
        System.out.println(name + "奶昔味");
    }
}
