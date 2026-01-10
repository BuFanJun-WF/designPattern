package com.wangfan.demo2;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Singleton_02 instance = Singleton_02.getInstance();
                System.out.println(Thread.currentThread().getName() + "-----" + instance);

            }).start();
        }
    }
}
