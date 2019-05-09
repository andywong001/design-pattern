package org.andywong;

/**
 * 懒汉式单例(双重检测)
 *
 * @author andywong
 * @date 2019-05-10 00:14
 */
public class LazyDoubleCheckSingletonV3 {
    /**
     * 类加载时就创建对象
     */
    private static LazyDoubleCheckSingletonV3 lazyDoubleCheckSingletonV3 = null;

    /**
     * 私有化构造方法，让外部无法创建
     */
    private LazyDoubleCheckSingletonV3(){

    }

    public static LazyDoubleCheckSingletonV3 getInstance() {
        if(null == lazyDoubleCheckSingletonV3){
            synchronized (LazyDoubleCheckSingletonV3.class){
                if(null == lazyDoubleCheckSingletonV3){
                    lazyDoubleCheckSingletonV3 = new LazyDoubleCheckSingletonV3();
                }
            }
        }
        return lazyDoubleCheckSingletonV3;
    }
}
