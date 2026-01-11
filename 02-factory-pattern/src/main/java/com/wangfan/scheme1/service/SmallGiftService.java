package com.wangfan.scheme1.service;

import cn.hutool.json.JSONUtil;
import com.wangfan.scheme1.entity.SmallGiftInfo;

/**
 * 模拟礼品服务
 */
public class SmallGiftService {
    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo){

        System.out.println("小礼品已发货,获奖用户注意查收! " + JSONUtil.toJsonStr(smallGiftInfo));
        return true;
    }
}
