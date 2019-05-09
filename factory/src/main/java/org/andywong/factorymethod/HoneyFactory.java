package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IFactory;
import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 蜂蜜系列工厂
 */
public class HoneyFactory implements IFactory {
    @Override
    public IProduct create() {
        return new HoneyProduct();
    }
}
