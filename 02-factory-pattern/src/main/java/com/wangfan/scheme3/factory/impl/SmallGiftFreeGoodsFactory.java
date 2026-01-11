package com.wangfan.scheme3.factory.impl;

import com.wangfan.scheme2.service.IFreeGoods;
import com.wangfan.scheme2.service.impl.SmallGiftFreeGoods;
import com.wangfan.scheme3.factory.FreeGoodsFactory;

/**
 * 小礼品发放接口-生产工厂
 */
public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
