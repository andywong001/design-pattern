package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IFactory;
import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 奶昔系列工厂
 */
public class MilkShakeFactory implements IFactory {
    @Override
    public IProduct create() {
        return new MilkShakeProduct();
    }
}
