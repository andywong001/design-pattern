package org.andywong.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 处理器
 *
 * @author andywong
 * @date 2019-05-10 10:51
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getInstance(Object o) {
        this.object = o;
        Class<?> clazz = o.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //做一些额外事情(前置处理)
        Object invoke = method.invoke(object, args);
        //后置处理
        return invoke;
    }
}
