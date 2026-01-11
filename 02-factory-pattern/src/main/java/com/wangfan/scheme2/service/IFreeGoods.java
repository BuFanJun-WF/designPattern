package com.wangfan.scheme2.service;

import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;

public interface IFreeGoods {
    //发放赠品
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
