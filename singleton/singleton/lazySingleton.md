# 2.懒汉式单例

比较懒,要用到的时候才创建



## 代码

###v1线程安全问题
```java
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
    private LazySingletonV1(){

    }

    public static LazySingletonV1 getInstance() {
        if(null == lazySingletonV1){
            lazySingletonV1 = new LazySingletonV1();
        }
        return lazySingletonV1;
    }
}

```



### v2粗粒度方法加锁

```java
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
    private LazySingletonV2(){

    }

    public static synchronized LazySingletonV2 getInstance() {
        if(null == lazySingletonV2){
            lazySingletonV2 = new LazySingletonV2();
        }
        return lazySingletonV2;
    }
}

```



### v3双重检测锁

```java
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

```



##缺点:

synchronized的性能问题