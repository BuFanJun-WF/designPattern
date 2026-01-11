package com.wangfan.scheme3.factory.impl;

import com.wangfan.scheme2.service.IFreeGoods;
import com.wangfan.scheme2.service.impl.DiscountFreeGoods;
import com.wangfan.scheme3.factory.FreeGoodsFactory;

/**
 * 优惠券发放接口-生产工厂
 */
public class DiscountFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new DiscountFreeGoods();
    }
}
