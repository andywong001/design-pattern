package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IFactory;
import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 酸奶系列工厂
 */
public class YogurtFactory implements IFactory {
    @Override
    public IProduct create() {
        return new YogurtProduct();
    }
}
