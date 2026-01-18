package com.wangfan.factory;

import com.wangfan.product.AbstractFreezer;
import com.wangfan.product.AbstractTV;
import com.wangfan.product.HisenseFreezer;
import com.wangfan.product.HisenseTV;

public class HisenseFactory implements AppliancesFactory{
    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }

    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }
}
