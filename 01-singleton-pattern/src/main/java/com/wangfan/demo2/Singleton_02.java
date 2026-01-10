package com.wangfan.demo2;

/**
 * 懒汉式
 */
public class Singleton_02 {
    // 用于存储单一实例的静态对象
    private static Singleton_02 instance;

    private Singleton_02() {}

    //通过判断对象是否被初始化,来选择是否创建对象
    public static Singleton_02 getInstance() {
        if (instance == null) {
            instance = new Singleton_02();
        }
        return instance;
    }
}
