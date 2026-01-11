package com.wangfan.scheme2.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.json.JSONUtil;
import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;
import com.wangfan.scheme2.entity.SmallGiftInfo;
import com.wangfan.scheme2.service.IFreeGoods;

public class SmallGiftFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品已发货,获奖用户注意查收! " + JSONUtil.toJsonStr(smallGiftInfo));
        return new ResponseResult("200","赠品: 小礼物发放成功!",smallGiftInfo);
    }
}
