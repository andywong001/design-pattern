package org.andywong;

/**
 * 懒汉式单例(粗粒度方法加锁)
 *
 * @author andywong
 * @date 2019-05-10 00:14
 */
public class LazySingletonV2 {
    /**
     * 类加载时就创建对象
     */
    private static LazySingletonV2 lazySingletonV2 = null;

    /**
     * 私有化构造方法，让外部无法创建
     */
    private LazySingletonV2() {

    }

    public static synchronized LazySingletonV2 getInstance() {
        if (null == lazySingletonV2) {
            lazySingletonV2 = new LazySingletonV2();
        }
        return lazySingletonV2;
    }
}
