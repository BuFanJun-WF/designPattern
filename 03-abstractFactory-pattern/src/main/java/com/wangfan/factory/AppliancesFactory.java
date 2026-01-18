package com.wangfan.factory;

import com.wangfan.product.AbstractFreezer;
import com.wangfan.product.AbstractTV;

/**
 * 抽象工厂: 在抽象工厂中可以声明多个工厂方法,用于创建不同类型的产品
 */
public interface AppliancesFactory {
    AbstractFreezer createFreezer();

    AbstractTV createTV();
}
