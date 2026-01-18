package com.wangfan.factory;

import com.wangfan.product.AbstractFreezer;
import com.wangfan.product.AbstractTV;
import com.wangfan.product.HairFreezer;
import com.wangfan.product.HairTV;

public class HairFactory implements AppliancesFactory{
    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }

    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }
}
