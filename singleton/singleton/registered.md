# 3.注册式(枚举、容器缓存)单例

```java
package org.andywong;

/**
 * 枚举注册式单例
 *
 * @author andywong
 * @date 2019-05-10 00:17
 */
public enum  EnumRegSingleton {
    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumRegSingleton getInstance() {
        return INSTANCE;
    }
}

```

