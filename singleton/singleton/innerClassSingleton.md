# 5.静态内部类式单例

解决饿汉式内存问题，又解决懒汉式性能问题



##代码

```java
package org.andywong;

/**
 * 静态内部类单例(解决饿汉式内存问题，又解决懒汉式性能问题)
 *
 * @author andywong
 * @date 2019-05-10 00:25
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){
        //防止通过反射暴力创建实例
//        if(null != StaticInnerClassSingletonHolder.STATICINNERCLASSSINGLETON){
//            throw new RuntimeException("不允许创建多个实例对象");
//        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.STATICINNERCLASSSINGLETON;
    }

    private static class StaticInnerClassSingletonHolder{
        private static final StaticInnerClassSingleton STATICINNERCLASSSINGLETON = new StaticInnerClassSingleton();
    }
}

```

