package com.wangfan.scheme3.controller;

import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;
import com.wangfan.scheme2.service.IFreeGoods;
import com.wangfan.scheme3.factory.FreeGoodsFactory;
import com.wangfan.scheme3.factory.FreeGoodsFactoryMap;

/**
 * 发放奖品接口
 */
public class DeliverController {
    /**
     * 按照类型的不同发放商品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo) {
        //根据类型获取工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardType());
        //从工厂中获取对应实例
        IFreeGoods freeGoods = goodsFactory.getInstance();
        System.out.println("=====工厂方法模式========");
        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);
        return result;
    }
}
