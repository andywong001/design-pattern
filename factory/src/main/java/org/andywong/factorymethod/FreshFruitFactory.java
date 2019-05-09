package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IFactory;
import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 鲜果系列工厂
 */
public class FreshFruitFactory implements IFactory {
    @Override
    public IProduct create() {
        return new FreshFruitProduct();
    }
}
