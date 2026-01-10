package com.wangfan.demo4;

/**
 * 双重校验
 */
public class Singleton_04 {
    // 使用volatile保证变量的可见性
    private volatile static Singleton_04 instance;
    private Singleton_04() {}
    // 对外提供静态方法获取对象


    public static Singleton_04 getInstance() {
        // 第一次判断如果instance不为空,则直接返回
        if (instance == null) {
            // 进入同步代码块进行抢锁
            synchronized (Singleton_04.class) {
                // 抢到锁后再进行判断是否为空
                if (instance == null) {
                    instance = new Singleton_04();
                }
            }
        }

        return instance;
    }
}
