package org.andywong.simplefactory;

/**
 * 香蕉味
 *
 * @author andywong
 * @date 2019-05-09 16:39
 */
public class BananaFruitImpl implements IFruit {
    @Override
    public void taste() {
        System.out.println("香蕉味");
    }
}
