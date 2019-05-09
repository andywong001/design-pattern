package org.andywong;

/**
 * 饿汉式单例
 *
 * @author andywong
 * @date 2019-05-10 00:13
 */
public class HungrySingletonV1 {

    /**
     * 类加载时就创建对象
     */
    private static HungrySingletonV1 hungrySingletonV1 = new HungrySingletonV1();

    /**
     * 私有化构造方法，让外部无法创建
     */
    private HungrySingletonV1(){

    }

    public static HungrySingletonV1 getInstance() {
        return hungrySingletonV1;
    }
}
