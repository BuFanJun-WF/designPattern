package com.wangfan.scheme2.controller;

import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;
import com.wangfan.scheme2.factory.FreeGoodsFactory;
import com.wangfan.scheme2.service.IFreeGoods;

public class DeliverController {
    /**
     * 发放奖品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo) {
        try {
            IFreeGoods freeGoods = FreeGoodsFactory.createFreeGoods(awardInfo.getAwardType());
            ResponseResult responseResult = freeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult("201","奖品发放失败!");
        }
    }
}
