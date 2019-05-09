package org.andywong.simplefactory;

/**
 * 奶茶店
 */
public class MilkTeaShopFactory {

    /**
     * 提供
     * @param need 需要的口味
     */
    public static IFruit provide(String need) {
        IFruit fruit = null;
        //西瓜
        if(need.equals("xg")){
            fruit = new WatermelonFruitImpl();
        }else if(need.equals("xj")){
            fruit = new BananaFruitImpl();
        }else if(need.equals("lm")){
            fruit = new BlueberryFruitImpl();
        }else{
            throw new RuntimeException("暂时没这种口味的哦");
        }
        return fruit;
    }
}
