package com.wangfan.demo3;

/**
 * 懒汉式-线程安全
 */
public class Singleton_03 {
    private static Singleton_03 instance;

    private Singleton_03() {}

    //添加synchronize,保证多线程模式下的单例对象的唯一性
    public static synchronized Singleton_03 getInstance() {
        if (instance == null) {
            instance = new Singleton_03();
        }
        return instance;
    }
}
