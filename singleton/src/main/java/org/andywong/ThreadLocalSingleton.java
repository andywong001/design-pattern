package org.andywong;

/**
 * ThreadLocal式单例(单个线程是线程安全)
 *
 * @author andywong
 * @date 2019-05-10 00:18
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> THREADLOCAL_INSTANCE = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return THREADLOCAL_INSTANCE.get();
    }
}
