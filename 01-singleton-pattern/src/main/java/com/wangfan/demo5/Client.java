package com.wangfan.demo5;

import java.util.concurrent.CountDownLatch;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis(); // 记录开始时间
        int threadCount = 10000;
        CountDownLatch latch = new CountDownLatch(threadCount); // 创建计数器

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    Singleton_05 instance = Singleton_05.getInstance();
                    System.out.println(Thread.currentThread().getName() + "-----" + instance);
                } finally {
                    latch.countDown(); // 每个线程完成后减少计数器
                }
            }).start();
        }

        latch.await(); // 等待所有线程完成

        long endTime = System.currentTimeMillis(); // 记录结束时间
        long totalTime = endTime - startTime;
        System.out.println("程序总运行时间: " + totalTime + " 毫秒");
    }
}
