package com.wangfan.demo1;

/**
 *
 */
public class Singleton_01 {
    //1. 私有构造方法
    private Singleton_01(){}

    //2. 在本类中创建对象
    private static final Singleton_01 instance = new Singleton_01();

    //3. 提供一个公共的访问方式,供外部访问 获取到单例对象
    public static Singleton_01 getInstance(){
        return instance;
    }
}
