package com.wangfan.demo5;

/**
 * 静态内部类
 */
public class Singleton_05 {

    // 静态内部类实现初始化创建实例
    private static class SingletonHolder {
        private static final Singleton_05 INSTANCE = new Singleton_05();
    }

    // 拒绝使用反射创建对象
    private Singleton_05() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问!");
        }
    }

    public static final Singleton_05 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
