package org.andywong;

/**
 * 饿汉式单例(静态代码块)）
 *
 * @author andywong
 * @date 2019-05-10 00:13
 */
public class HungrySingletonV2 {

    /**
     * 类加载时就创建对象
     */
    private static HungrySingletonV2 hungrySingletonV1 = null;

    static {
        hungrySingletonV1 = new HungrySingletonV2();
    }

    /**
     * 私有化构造方法，让外部无法创建
     */
    private HungrySingletonV2() {

    }

    public static HungrySingletonV2 getInstance() {
        return hungrySingletonV1;
    }
}
