package org.andywong.simplefactory;

/**
 * 西瓜味
 *
 * @author andywong
 * @date 2019-05-09 16:39
 */
public class WatermelonFruitImpl implements IFruit {
    @Override
    public void taste() {
        System.out.println("西瓜味");
    }
}
