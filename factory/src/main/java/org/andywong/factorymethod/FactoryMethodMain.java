package org.andywong.factorymethod;

import org.andywong.factorymethod.interfaces.IFactory;
import org.andywong.factorymethod.interfaces.IProduct;

/**
 * 工厂方法测试
 *
 * @author andywong
 * @date 2019-05-09 21:48
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        IFactory factory = new YogurtFactory();
        IProduct product = factory.create();
        product.taste("芒果");
    }
}
