package com.wangfan.scheme2.factory;

import com.wangfan.scheme2.service.IFreeGoods;
import com.wangfan.scheme2.service.impl.DiscountFreeGoods;
import com.wangfan.scheme2.service.impl.SmallGiftFreeGoods;
import com.wangfan.scheme2.service.impl.YouKuMemberFreeGoods;

/**
 * 具体工厂: 生成赠品
 */
public class FreeGoodsFactory {
    public static IFreeGoods createFreeGoods(Integer awardType){
        if(awardType == 1){
            return new DiscountFreeGoods();
        }
        else if(awardType == 2){
            return new YouKuMemberFreeGoods();
        }
        else if(awardType == 3){
            return new SmallGiftFreeGoods();
        }
        return null;
    }
}
