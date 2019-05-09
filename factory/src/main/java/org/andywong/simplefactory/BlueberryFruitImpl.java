package org.andywong.simplefactory;

/**
 * 蓝莓味
 *
 * @author andywong
 * @date 2019-05-09 16:39
 */
public class BlueberryFruitImpl implements IFruit {
    @Override
    public void taste() {
        System.out.println("蓝莓味");
    }
}
