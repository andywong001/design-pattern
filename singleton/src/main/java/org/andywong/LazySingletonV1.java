package org.andywong;

/**
 * 懒汉式单例(有线程安全问题)
 *
 * @author andywong
 * @date 2019-05-10 00:14
 */
public class LazySingletonV1 {
    /**
     * 类加载时就创建对象
     */
    private static LazySingletonV1 lazySingletonV1 = null;

    /**
     * 私有化构造方法，让外部无法创建
     */
    private LazySingletonV1() {

    }

    public static LazySingletonV1 getInstance() {
        if (null == lazySingletonV1) {
            lazySingletonV1 = new LazySingletonV1();
        }
        return lazySingletonV1;
    }
}
