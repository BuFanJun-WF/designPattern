package com.wangfan.scheme2.service.impl;

import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;
import com.wangfan.scheme2.service.IFreeGoods;

/**
 * 模拟优酷会员服务
 */
public class YouKuMemberFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("会员绑定成功,手机号: " + phone);
        return new ResponseResult("200","赠品: 优酷会员发放成功!");
    }
}
